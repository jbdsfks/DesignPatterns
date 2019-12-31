package picture.chapter04_factory.idcard;

import picture.chapter04_factory.framework.Product;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/30 15:48
 */
public class IDCard extends Product {
    private String owner;
    private Integer number;
    public IDCard(String owner, Integer number){
        System.out.println("制作" + owner + "的ID卡。");
        this.owner = owner;
        this.number = number;
    }
    public void use() {
        System.out.println("使用" + owner + "("+ number + ") 的ID卡。");
    }

    public String getOwner() {
        return owner;
    }

    public Integer getNumber() {
        return number;
    }
}
