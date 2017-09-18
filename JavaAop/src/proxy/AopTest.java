package proxy;

import proxy.impl.AnimalInterface;
import proxy.impl.AopMethod;

import java.lang.reflect.Method;

/**
 * @Author: alan.peng
 * @Description:
 * @Date: Create in 14:49 2017/9/17
 * @Modified By：
 */
public class AopTest {

    public static void main(String[] args) {
        AnimalInterface dog = AnimalFactory.getAnimal(DogImpl.class, new AopMethod() {
            @Override
            public void after(Object proxy, Method method, Object[] args) {
                if (method.getName().equals("getProperty")) {
                    System.out.println("成功拦截" + method.getName() + "方法，结束。");
                }
            }

            @Override
            public void before(Object proxy, Method method, Object[] args) {
                if (method.getName().equals("getProperty")) {
                    System.out.println("成功拦截" + method.getName() + "方法，启动。");
                }
            }
        });

        dog.say();
        String name1 = "我的名字是" + dog.getName();
        System.out.println(name1);
        dog.setName("二狗子");
        String name2 = "我的名字是" + dog.getName();
        System.out.println(name2);
        dog.getProperty();
    }
}
