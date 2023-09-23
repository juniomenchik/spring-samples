package estructural.decorator.product;

import java.math.BigDecimal;

public interface ProductInterface {
    BigDecimal getPrice();
    String getName();
    void setPrice(BigDecimal price);
    void setName(String name);
}
