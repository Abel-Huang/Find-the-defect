package cn.abelib.structural.adapter.objectadapter;


/**
 * @Author: abel.huang
 * @Date: 2019-01-31 09:33
 *  对象适配，基于组合
 *  两种模式使用时，优先推荐使用对象适配，
 *  组合优先于继承
 */
public class Example {
    public static void main(String[] args) {
        Target target = new DetailTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
