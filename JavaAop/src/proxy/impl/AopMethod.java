package proxy.impl;

import java.lang.reflect.Method;

/**
 * @Author: alan.peng
 * @Description:
 * @Date: Create in 14:46 2017/9/17
 * @Modified By：
 */
public interface AopMethod {

    //实例方法执行前执行的方法
    void after(Object proxy, Method method, Object[] args);

    //实例方法执行后执行的方法
    void before(Object proxy ,Method method, Object[] args);
}
