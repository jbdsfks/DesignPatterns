package picture.chapter05_singleton;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/31 15:59
 */
public class TicketMaker {
    private int ticket = 100;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
    }

    public static TicketMaker getInstance(){
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
}
