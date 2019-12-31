package picture.chapter04_factory.idcard;

import picture.chapter04_factory.framework.Factory;
import picture.chapter04_factory.framework.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/30 15:50
 */
public class IDCardFactory extends Factory {
    private Integer current = 100;
    private Map<String, Integer> owners = new HashMap<String, Integer>();

    public Product createFactory(String owner) {
        return new IDCard(owner, current++);
    }

    public void registerFactory(Product product) {
        owners.put(((IDCard)product).getOwner(), ((IDCard) product).getNumber());
    }
}
