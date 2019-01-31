package cn.abelib.structural.decorator;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 06:52
 *  被装饰类
 */
public class Cake extends BaseCake {
    @Override
    public String getDesc() {
        return "a cake";
    }

    @Override
    public int cost() {
        return 10;
    }
}
