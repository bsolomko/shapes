package sm;

import java.util.ArrayList;
import java.util.List;

public class Basket {

     private final List<Product> products = new ArrayList<>();

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                '}';
    }

    public void addGoods(Product product){
        products.add(product);
    }
}
