package org.nirvana.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gzm
 * @date 2020/7/18 5:43 下午
 *
 * @Adaptive: 可以用在类或方法[接口]上。
 * 1. 用在类上, 不会为该类生成代理类
 * 2. 用在方法上时, 会为该方法生成代理逻辑。
 *
 * @Adaptive 注解中的String[] 中, 会先拿到第一个name. 没有再拿第二个name
 * 如果都没有找到对应的Extension. 则会通过@SPI 中的值拿默认的Extension.
 */
public class AdaptiveMain {

    public static void main(String[] args) {
        ExtensionLoader<WrapperCar> extensionLoader = ExtensionLoader.getExtensionLoader(WrapperCar.class);
        WrapperCar adaptiveExtension = extensionLoader.getAdaptiveExtension();
//        Map<String, String> params = new HashMap<>();
//        params.put("type", "wrapperCarImpl2");
//        URL url = new URL("", "", 0, params);

        // 如果使用这种url的方式, WrapperCar接口方法中的@Adaptive 就没有参数. 或者 ? 后面接@Adaptive中的参数名
        // wrapper.car 的命名规则, 具体的接口类小写。中间用 . 隔离开
        URL url = URL.valueOf("dubbo://localhost/WrapperCar?type=wrapperCarImpl");
        String parameter = url.getParameter("wrapper.car");
        adaptiveExtension.info(url);
    }
}
