package cn.abelib.creational.singleton;

/**
 * 饿汉模式
 * 类加载时就完成初始化（有且仅有一次，多线程下没有问题）
 * 没有Lazy Loading 的效果 会造成内存浪费
 */

public class HungryModelSingleton {
    private final static HungryModelSingleton INSTANCE = new HungryModelSingleton();

    private HungryModelSingleton() {
    }

    public static HungryModelSingleton getInstance() {
        return INSTANCE;
    }
}
