package cn.abelib.structural.facade;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 05:31
 * 物流服务子系统
 */
public class ShipService {
    public String ship(Product product) {
        // 物流逻辑
        System.out.println(product.getName() + " ship now!");
        String shippingOrderNo = "123";
        return shippingOrderNo;
    }
}
