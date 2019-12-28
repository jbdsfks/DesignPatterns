package zen.chapter02_lsp.example2;

import zen.chapter02_lsp.example1.Rifle;

/**
 * @Description 子类可以有自己的个性
 * @Author lzj
 * @Date 2019/12/28 18:31
 */
public class Client {
    public static void main(String[] args) {
        Snipper snipper = new Snipper();
        snipper.killEnemy(new AUG());

        snipper.killEnemy((AUG) new Rifle());
    }
}
