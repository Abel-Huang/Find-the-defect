package cn.abelib.structural.adapter.classadapter;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 09:30
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
