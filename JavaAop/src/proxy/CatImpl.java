package proxy;

import proxy.annon.Seven;
import proxy.impl.AnimalInterface;
import proxy.impl.AopMethod;

import java.lang.reflect.Method;

/**
 * @Author: alan.peng
 * @Description:
 * @Date: Create in 10:26 2017/9/18
 * @Modified By：
 */
public class CatImpl  implements AnimalInterface{

    @Seven(value = "tom")
    private String name;

    private String property;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void say() {
        System.out.println("hello i am " + this.name);
    }

    @Override
    public void getProperty() {
        System.out.println(this.name + "\t" + this.property);
    }

    @Override
    @Seven(Property = "陆栖")
    public void setProperty(String property) {
        this.property = property;
    }


    public static void main(String[] args) {
        AnimalInterface cat = AnimalFactory.getAnimal(CatImpl.class, new AopMethod() {
            @Override
            public void after(Object proxy, Method method, Object[] args) {
                System.out.println("after do something ");
            }

            @Override
            public void before(Object proxy, Method method, Object[] args) {
                System.out.println("bedore do something");
            }
        });

        cat.say();

        cat.getProperty();
    }
}
