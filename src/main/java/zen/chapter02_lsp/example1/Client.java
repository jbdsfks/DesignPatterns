package zen.chapter02_lsp.example1;

/**
 * @Description 子类必须完全实现父类的方法
 * @Author lzj
 * @Date 2019/12/28 15:48
 */
public class Client {
    public static void main(String[] args) {
        Soldier sanMao = new Soldier();
        
        sanMao.setGun(new Handgun());
        sanMao.killEnemy();

        sanMao.setGun(new Rifle());
        sanMao.killEnemy();

        sanMao.setGun(new MachineGun());
        sanMao.killEnemy();
    }
}
