package cn.abelib.structural.adapter.classadapter;


/**
 * @Author: abel.huang
 * @Date: 2019-01-31 09:33
 *  类适配，基于继承
 */
public class Example {
    public static void main(String[] args) {
        Target target = new DetailTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
