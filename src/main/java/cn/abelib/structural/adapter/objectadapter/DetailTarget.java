package cn.abelib.structural.adapter.objectadapter;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 07:57
 */
public class DetailTarget implements Target {
    @Override
    public void request() {
        System.out.println("Object adapter DetailTarget method");
    }
}
