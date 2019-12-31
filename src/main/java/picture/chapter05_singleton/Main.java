package picture.chapter05_singleton;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/31 15:48
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton start...");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2)
            System.out.println("1 和 2 是同一个实例");
        else
            System.out.println("1 和 2 不是同一个实例");
        System.out.println("Singleton end...");

        System.out.println("TicketMaker start...");
        for (int i = 1; i <= 10; i++)
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        System.out.println("TicketMaker end...");

        System.out.println("Triple start...");
        for (int i = 0; i < 9; i++) {
            System.out.println(i + " : " + Triple.getInstance(i%3));
        }
        System.out.println("Triple end...");
    }
}
