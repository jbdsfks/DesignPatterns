package zen.chapter02_lsp.example3;

import java.util.HashMap;

/**
 * @Description 覆盖或实现父类的方法时输入参数可以被放大
 * @Author lzj
 * @Date 2019/12/28 18:36
 */
public class Client {
    public static void main(String[] args) {
        Father father = new Father();
        father.doSomething(new HashMap());

        Son son = new Son();
        son.doSomething(new HashMap());
    }
}
