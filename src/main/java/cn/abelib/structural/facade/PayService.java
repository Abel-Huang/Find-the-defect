package cn.abelib.structural.facade;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 05:29
 * 商品支付子系统
 */
public class PayService {
    public boolean pay(Product product) {
        // 支付逻辑
        System.out.println(product.getName() + " pay successful!");
        return true;
    }
}
