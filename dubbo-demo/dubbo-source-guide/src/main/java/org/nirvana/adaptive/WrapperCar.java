package org.nirvana.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author gzm
 * @date 2020/7/18 11:07 下午
 */
@SPI
public interface WrapperCar {
    @Adaptive({"type"})
    //@Adaptive
    void info(URL url);
}
