package cn.abelib.creational.prototype;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 04:42
 */
public class Example {
    public static void main(String[] args) throws CloneNotSupportedException {
        ComplexProduct product = new ComplexProduct();
        product.setContent("ComplexProduct");
        product.setDesc("This is a ComplexProduct");

        for (int i = 0; i< 10; i++ ) {
            ComplexProduct tempProduct = (ComplexProduct) product.clone();
            tempProduct.setId(i + 1);
            tempProduct.setName("Product_" + (i + 1));
            ComplexProductUtil.createProduct(tempProduct);
        }
    }
}
