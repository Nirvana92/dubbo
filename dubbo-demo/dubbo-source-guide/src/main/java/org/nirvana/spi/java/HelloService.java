package org.nirvana.spi.java;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author gzm
 * @date 2020/7/18 2:20 下午
 */
@SPI("service")
public interface HelloService {

    String sayHello(String name);
}
