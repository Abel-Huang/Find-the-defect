package cn.abelib.structural.facade;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 05:24
 */
public class Test {
    public static void main(String[] args) {
        Product product = new Product("Book");
        SaleService saleService = new SaleService();
        saleService.sale(product);
    }

}
