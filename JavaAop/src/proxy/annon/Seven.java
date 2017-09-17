package proxy.annon;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: alan.peng
 * @Description:
 * @Date: Create in 14:31 2017/9/17
 * @Modified By：
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Seven {

    public String value() default "小黑";

    public String Property() default "无属性";
}
