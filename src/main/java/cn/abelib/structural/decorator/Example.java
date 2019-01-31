package cn.abelib.structural.decorator;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 07:00
 */
public class Example {
    public static void main(String[] args) {
        BaseCake cake;
        cake = new Cake();
        cake = new IceCreamDecorator(cake);
        cake = new ButterDecorator(cake);
        cake = new ButterDecorator(cake);
        System.out.println(cake.getDesc() + ", cost=" + cake.cost());
    }
}
