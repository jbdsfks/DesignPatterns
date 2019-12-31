package picture.chapter05_singleton;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/31 15:47
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
