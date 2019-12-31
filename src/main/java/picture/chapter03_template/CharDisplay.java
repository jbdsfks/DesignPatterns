package picture.chapter03_template;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/30 15:27
 */
public class CharDisplay extends AbstractDisplay {
    private char ch;
    public CharDisplay(char ch){
        this.ch = ch;
    }
    public void open() {
        System.out.print("<<");
    }

    public void print() {
        System.out.print(ch);
    }

    public void close() {
        System.out.println(">>");
    }
}
