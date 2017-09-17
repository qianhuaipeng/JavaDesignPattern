package proxy;

/**
 * @Author: alan.peng
 * @Description:
 * @Date: Create in 14:44 2017/9/17
 * @Modified By：
 */
public class Test {
    public static void main(String[] args) {
        DogImpl dogImpl = new DogImpl();
        System.out.println(dogImpl.getName());
        dogImpl.getProperty();
    }
}
