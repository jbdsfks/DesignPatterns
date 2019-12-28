package zen.chapter02_lsp.example1;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/28 15:47
 */
public class Soldier {
    private AbstractGun gun;
    public void setGun(AbstractGun gun){
        this.gun = gun;
    }
    public void killEnemy(){
        System.out.println("士兵开始杀敌人...");
        gun.shoot();
    }
}
