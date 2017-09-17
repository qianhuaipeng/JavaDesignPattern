package proxy;

import proxy.annon.Seven;
import proxy.impl.AnimalInterface;

/**
 * @Author: alan.peng
 * @Description:
 * @Date: Create in 14:37 2017/9/17
 * @Modified By：
 */
public class DogImpl implements AnimalInterface{

    @Seven(value = "小白")
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
        System.out.println("Hello");
    }

    @Override
    public void getProperty() {
        System.out.println(this.name + this.property);
    }

    @Override
    @Seven(Property = "陆栖")
    public void setProperty(String property) {
        this.property = property;
    }
}
