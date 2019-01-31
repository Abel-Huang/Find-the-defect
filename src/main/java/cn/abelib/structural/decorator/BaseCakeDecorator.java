package cn.abelib.structural.decorator;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 06:52
 *  抽象代理类
 */
public class BaseCakeDecorator extends BaseCake {
    private BaseCake baseCake;

    public BaseCakeDecorator(BaseCake baseCake) {
        this.baseCake = baseCake;
    }

    @Override
    public String getDesc() {
        return this.baseCake.getDesc();
    }

    @Override
    public int cost() {
        return this.baseCake.cost();
    }
}
