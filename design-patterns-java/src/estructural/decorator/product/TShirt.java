package estructural.decorator.product;

import java.math.BigDecimal;

public class TShirt implements ProductInterface {

    public String name = "T-Shirt";
    public BigDecimal price = new BigDecimal("10.00");

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
