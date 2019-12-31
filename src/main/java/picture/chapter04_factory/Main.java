package picture.chapter04_factory;

import picture.chapter04_factory.framework.Factory;
import picture.chapter04_factory.framework.Product;
import picture.chapter04_factory.idcard.IDCardFactory;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/30 15:53
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product id1 = factory.create("小红");
        Product id2 = factory.create("小绿");
        Product id3 = factory.create("小紫");

        id1.use();
        id2.use();
        id3.use();

    }
}
