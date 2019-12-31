package picture.chapter05_singleton.csnotes;

/**
 * @Description 懒汉式-线程安全
 * @Author lzj
 * @Date 2019/12/31 19:21
 */
public class Singleton3 {
    private Singleton3(){}
    private static Singleton3 singleton3;
    public synchronized static Singleton3 getInstance(){
        if (singleton3 == null){
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
