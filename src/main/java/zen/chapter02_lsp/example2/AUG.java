package zen.chapter02_lsp.example2;

import zen.chapter02_lsp.example1.Rifle;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/28 15:53
 */
public class AUG extends Rifle {
    public void zoomOut(){
        System.out.println("通过望远镜观察敌人...");
    }

    @Override
    public void shoot() {
        System.out.println("AUG射击...");
    }
}
