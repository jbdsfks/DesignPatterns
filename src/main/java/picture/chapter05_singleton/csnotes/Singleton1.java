package picture.chapter05_singleton.csnotes;

/**
 * @Description 懒汉式-线程不安全
 * @Author lzj
 * @Date 2019/12/31 19:19
 */
public class Singleton1 {
    private static Singleton1 singleton;
    private Singleton1(){};
    public static Singleton1 getInstance(){
        if (singleton == null){
            singleton = new Singleton1();
        }
        return singleton;
    }
}
