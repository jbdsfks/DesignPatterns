package picture.chapter05_singleton;

/**
 * @Description
 * @Author lzj
 * @Date 2019/12/31 16:06
 */
public class Triple {
    private static Triple[] triple = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };
    private int id;

    private Triple(int id) {
        this.id = id;
        System.out.println("new Triple(" + id + ")");
    }

    public static Triple getInstance(int id) {
        return triple[id];
    }

    @Override
    public String toString() {
        return "Triple{" +
                "id=" + id +
                '}';
    }
}
