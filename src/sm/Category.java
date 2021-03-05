package sm;

import java.util.ArrayList;

public class Category {
    private String name;
    ArrayList<Product> products = new ArrayList<>();

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
