package cn.abelib.structural.decorator;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 06:58
 */
public class ButterDecorator extends BaseCakeDecorator {
    public ButterDecorator(BaseCake baseCake) {
        super(baseCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " + a butter";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
