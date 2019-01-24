package cn.abelib.creational.singleton;

/**
 * Created by abel on 2017/12/26.
 */
public class StaticSingleton {
    private StaticSingleton(){
        System.err.println("StaticSingleton is create");
    }

    private static class SingletonHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
