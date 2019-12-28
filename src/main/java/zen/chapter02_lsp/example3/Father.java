package zen.chapter02_lsp.example3;

import java.util.Collection;
import java.util.HashMap;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/28 18:34
 */
public class Father {
    public Collection doSomething(HashMap map){
        System.out.println("父类被执行");
        return map.values();
    }
}
