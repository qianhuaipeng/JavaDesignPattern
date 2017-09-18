package proxy.annon;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: alan.peng
 * @Description:
 * @Date: Create in 15:29 2017/9/17
 * @Modified By：
 */
public class AnnoInjection {

    public static Object getBean(Object object){
        try {
            //获取类的属性
            Field f[] = object.getClass().getDeclaredFields();
            for (Field ff:
                 f) {
                //获得属性上的注解
                Seven s = ff.getAnnotation(Seven.class);
                if (s != null) {
                    System.out.println("注入" + ff.getName() + "\t\t" + s.value());
                    // 反射调用public set方法,如果为访问级别private,那么可以直接使用属性的set(obj, value);
                    object.getClass().getMethod("set"+ff.getName().substring(0,1).toUpperCase()+ff.getName().substring(1),
                            new Class<?>[]{String.class}).invoke(object,s.value());

                }
            }
            //获得所有方法
            Method methods[] = object.getClass().getDeclaredMethods();
            for (Method m: methods ) {
                Seven s = m.getAnnotation(Seven.class);
                if (s != null) {
                    System.out.println("注入" + m.getName() + "方法\t" + s.Property());
                    m.invoke(object,s.Property());
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return object;
    }
}
