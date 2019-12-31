package picture.chapter04_factory.framework;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/30 15:44
 */
public abstract class Factory {

    public abstract Product createFactory(String owner);
    public abstract void registerFactory(Product product);

    public final Product create(String owner){
        Product product = createFactory(owner);
        registerFactory(product);
        return product;
    }

}
