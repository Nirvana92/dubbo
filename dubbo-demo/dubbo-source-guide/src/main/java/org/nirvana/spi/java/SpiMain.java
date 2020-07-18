package org.nirvana.spi.java;

import java.util.ServiceLoader;

/**
 * @author gzm
 * @date 2020/7/18 2:19 下午
 */
public class SpiMain {

    public static void main(String[] args) {
        ServiceLoader<HelloService> load = ServiceLoader.load(HelloService.class);
        load.forEach(helloService -> helloService.sayHello("haha"));


    }
}
