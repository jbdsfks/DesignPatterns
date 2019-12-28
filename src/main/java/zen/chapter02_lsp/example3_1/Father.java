package zen.chapter02_lsp.example3_1;

import java.util.Collection;
import java.util.Map;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/28 18:34
 */
public class Father {
    public Collection doSomething(Map map){
        System.out.println("父类被执行");
        return map.values();
    }
}
