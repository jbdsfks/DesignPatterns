package zen.chapter02_lsp.example3_1;

import java.util.HashMap;

/**
 * @Description 子类中方法的前置条件必须与超类中被覆写的方法的前置条件相同或更宽松
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
