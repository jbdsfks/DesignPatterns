package picture.chapter02_adapter.has;

import picture.chapter02_adapter.extend.Banner;

public class PrintBanner extends Print {
    private Banner banner;
    public PrintBanner(String string){
        this.banner = new Banner(string);
    }
    public void printWeek(){
        banner.showWithParen();
    }
    public void printStrong(){
        banner.showWithAster();
    }
}
