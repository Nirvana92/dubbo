package org.nirvana.adaptive;

import org.apache.dubbo.common.URL;

/**
 * @author gzm
 * @date 2020/7/18 11:18 下午
 */
public class WrapperCarImpl2 implements WrapperCar {
    @Override
    public void info(URL url) {
        System.out.println("WrapperCarImpl2");
    }
}
