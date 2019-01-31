package cn.abelib.structural.adapter.objectadapter;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 09:30
 */
public class Adapter implements Target {
    private static Adaptee adaptee;

    static {
        adaptee = new Adaptee();
    }

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
