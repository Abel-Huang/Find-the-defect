package cn.abelib.structural.facade;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 05:28
 * 商品库存校验子系统
 */
public class StockService {
    public boolean canBuy(Product product) {
        // 库存校验逻辑
        System.out.println(product.getName() + " can buy!");
        return true;
    }
}
