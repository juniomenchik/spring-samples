package estructural.decorator.product;

import java.math.BigDecimal;

public class ProductDecorator implements ProductInterface {
    protected ProductInterface product;
    protected String decoration;

    public ProductDecorator(ProductInterface product) {
        this.product = product;
        this.decoration = "Decorated";
    }

    @Override
    public BigDecimal getPrice() {
        return this.product.getPrice();
    }

    @Override
    public String getName() {
        return this.product.getName();
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.product.setPrice(price);
    }

    @Override
    public void setName(String name) {
        this.product.setName(name);
    }

    @Override
    public String toString() {
        return "ProductDecorator{" +
                "product=" + product.toString() +
                ", decoration='" + decoration + '\'' +
                '}';
    }
}
