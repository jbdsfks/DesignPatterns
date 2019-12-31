package picture.chapter05_singleton.csnotes;

/**
 * @Description 饿汉式-线程安全
 * @Author lzj
 * @Date 2019/12/31 19:20
 */
public class Singleton2 {
    private Singleton2(){}
    private static Singleton2 singleton2 = new Singleton2();
    public static Singleton2 getInstance(){
        return singleton2;
    }
}
