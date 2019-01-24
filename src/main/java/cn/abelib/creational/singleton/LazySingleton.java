package cn.abelib.creational.singleton;

/**
 * Created by abel on 2017/12/26.
 * 延迟加载， 只有调用时时，才会生成实例
 */
public class LazySingleton {
    private LazySingleton(){
        System.err.println("LazySingleton is create");
    }
    private static LazySingleton instance = null;
    public static synchronized LazySingleton getInstance(){
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }
}
