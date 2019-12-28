package zen.chapter02_lsp.example3_1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/28 18:35
 */
public class Son extends Father {
    public Collection doSomething(HashMap map){
        System.out.println("子类被执行");
        return map.values();
    }
}
