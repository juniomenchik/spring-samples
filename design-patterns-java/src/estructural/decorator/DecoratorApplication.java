package estructural.decorator;

import estructural.decorator.product.ProductDecorator;
import estructural.decorator.product.ProductInterface;
import estructural.decorator.product.ProductStampDecorator;
import estructural.decorator.product.TShirt;

public class DecoratorApplication {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt();
        System.out.println(tShirt);

        ProductInterface decoratedTShirt = new ProductDecorator(tShirt);
        System.out.println(decoratedTShirt);

        ProductInterface decoratedTShirtWithStamp = new ProductStampDecorator(decoratedTShirt);
        System.out.println(decoratedTShirtWithStamp);

    }
}
