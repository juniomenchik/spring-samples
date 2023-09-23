package estructural.decorator.product;

import java.math.BigDecimal;

public class ProductStampDecorator extends ProductDecorator {
    protected String stamp;
    public ProductStampDecorator(ProductInterface product) {
        super(product);
        this.stamp = "Stamped with Gold";
        this.product.setPrice(product.getPrice().add(new BigDecimal("200.00")));
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "ProductStampDecorator{" +
                "product=" + product.toString() +
                ", decoration='" + decoration + '\'' +
                ", stamp='" + stamp + '\'' +
                '}';
    }
}
