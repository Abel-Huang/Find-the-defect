package cn.abelib.structural.decorator;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 06:55
 */
public class IceCreamDecorator extends BaseCakeDecorator {
    public IceCreamDecorator(BaseCake baseCake) {
        super(baseCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " + an ice cream";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
