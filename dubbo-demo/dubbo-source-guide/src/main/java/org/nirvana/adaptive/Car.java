package org.nirvana.adaptive;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author gzm
 * @date 2020/7/18 5:41 下午
 */

@SPI
public interface Car {
    void run(String carName);
}
