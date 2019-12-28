package zen.chapter02_lsp.example3;

import java.util.Collection;
import java.util.Map;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/28 18:35
 */
public class Son extends Father {
    public Collection doSomething(Map map){
        System.out.println("子类被执行");
        return map.values();
    }
}
