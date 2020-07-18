package org.nirvana.adaptive;

/**
 * @author gzm
 * @date 2020/7/18 5:41 下午
 */
public class RedCar implements Car {
    
    @Override
    public void run(String carName) {
        System.out.println("carName: "+carName+" run......");
    }
}
