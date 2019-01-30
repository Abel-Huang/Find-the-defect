package cn.abelib.structural.facade;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 05:34
 */
public class SaleService {
    private static StockService stockService;
    private static PayService payService;
    private static ShipService shipService;

    static {
        stockService = new StockService();
        payService = new PayService();
        shipService = new ShipService();
    }

    public void sale(Product product) {
        if (stockService.canBuy(product)) {
            if (payService.pay(product)) {
                String shippingNo =  shipService.ship(product);
                System.out.println("Sale success, id=" + shippingNo);
            }
        }
    }
}
