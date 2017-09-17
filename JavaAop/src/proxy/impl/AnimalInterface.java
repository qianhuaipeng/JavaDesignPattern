package proxy.impl;

/**
 * @Author: alan.peng
 * @Description:
 * @Date: Create in 13:49 2017/9/17
 * @Modified By：
 */
public interface AnimalInterface {

    /**
     * 设置名字
     * @param name
     */
    void setName(String name);

    /**
     *获取名字
     * @return
     */
    String getName();

    /**
     * 叫声
     */
    void say();

    /**
     * 获取栖性
     */
    void getProperty();

    /**
     * 设置栖性
     * @param property
     */
    void setProperty(String property);
}
