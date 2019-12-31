package picture.chapter03_template;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/30 15:29
 */
public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;
    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public void open() {
        printLine();
    }

    public void print() {
        System.out.println("|" + string + "|");
    }

    public void close() {
        printLine();
    }
}
