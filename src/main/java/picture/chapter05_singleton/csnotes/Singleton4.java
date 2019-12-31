package picture.chapter05_singleton.csnotes;

/**
 * @Description 双重校验锁-线程安全
 * @Author lzj
 * @Date 2019/12/31 19:23
 */
public class Singleton4 {
    private Singleton4(){}
    private volatile static Singleton4 singleton4;
    public static Singleton4 getInstance(){
        if (singleton4 == null){
            synchronized (Singleton4.class){
                if (singleton4 == null){
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
