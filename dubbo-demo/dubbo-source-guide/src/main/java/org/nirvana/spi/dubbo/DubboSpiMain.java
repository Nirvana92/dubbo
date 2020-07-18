package org.nirvana.spi.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.nirvana.spi.java.HelloService;

/**
 * @author gzm
 * @date 2020/7/18 2:26 下午
 *
 * dubbo 版本的spi; dubbo的spi文件中支持k-v 形式. 需要在接口中添加 @SPI
 * 将所需要的配置文件放在 META-INF/services, META-INF/dubbo 中、
 */
public class DubboSpiMain {
    public static void main(String[] args) {
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);
        // HelloService defaultExtension = extensionLoader.getExtension("service");
        HelloService service = extensionLoader.getExtension("true");
        service.sayHello("hs");
    }
}
