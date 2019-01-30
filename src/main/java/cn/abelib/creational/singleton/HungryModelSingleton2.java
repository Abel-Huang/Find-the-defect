package cn.abelib.creational.singleton;

/**
 * @author abel
 */
public class HungryModelSingleton2 {
    private static HungryModelSingleton2 instance;

    static {
        instance = new HungryModelSingleton2();
    }

    private HungryModelSingleton2() {
    }

    public static HungryModelSingleton2 getInstance() {
        return instance;
    }
}
