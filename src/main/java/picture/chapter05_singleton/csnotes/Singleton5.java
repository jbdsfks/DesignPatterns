package picture.chapter05_singleton.csnotes;

/**
 * @Description 静态内部类实现
 * @Author lzj
 * @Date 2019/12/31 19:26
 */
public class Singleton5 {
    private Singleton5(){}
    private static class SingletonHandler{
        private static Singleton5 INSTANCE = new Singleton5();
    }
    public static Singleton5 getInstance(){
        return SingletonHandler.INSTANCE;
    }
}
