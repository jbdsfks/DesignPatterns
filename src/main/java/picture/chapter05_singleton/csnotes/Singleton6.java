package picture.chapter05_singleton.csnotes;

/**
 * @Description 枚举实现
 * @Author lzj
 * @Date 2019/12/31 19:29
 */
public enum Singleton6 {
    SINGLETON_6;
    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public static void main(String[] args) {
        Singleton6 first = Singleton6.SINGLETON_6;
        first.setObjName("first");
        System.out.println(first.getObjName());
        Singleton6 second = Singleton6.SINGLETON_6;
        second.setObjName("second");
        System.out.println(second.getObjName());
        System.out.println(first.getObjName());
        System.out.println(second.getObjName());

        Singleton6[] enumConstants = Singleton6.class.getEnumConstants();
        for (Singleton6 enumConstant : enumConstants){
            System.out.println(enumConstant.getObjName());
        }
    }
}
