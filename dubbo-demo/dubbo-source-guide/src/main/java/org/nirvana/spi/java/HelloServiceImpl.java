package org.nirvana.spi.java;

/**
 * @author gzm
 * @date 2020/7/18 2:20 下午
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("Hello, "+name);
        return "Hello, "+name;
    }
}
