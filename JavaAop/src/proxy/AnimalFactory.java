package proxy;

import proxy.annon.AnnoInjection;
import proxy.impl.AopMethod;

import java.lang.reflect.Proxy;

/**
 * @Author: alan.peng
 * @Description:
 * @Date: Create in 14:51 2017/9/17
 * @Modified By：
 */
public class AnimalFactory {

    private static Object getAnimalBase(Object obj , AopMethod method){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),new AopHandler(AnnoInjection.getBean(obj),method));
    }


    public static <T> T getAnimal(Object obj,AopMethod method){
        return (T) getAnimalBase(obj,method);
    }

    public static <T> T
}
