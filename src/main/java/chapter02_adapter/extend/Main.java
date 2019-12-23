package chapter02_adapter.extend;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("hello");
        print.printWeek();
        print.printStrong();
    }
}
