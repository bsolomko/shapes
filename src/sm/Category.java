package sm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Category {
    final private String name;
    final List<Product> products;

    public Category(String name, List<Product> products) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) && Objects.equals(products, category.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }
    public void printAllProductsInCategory(){
        System.out.println("LIST OF PRODUCTS");
        for (Product product: products) {
            System.out.println(product.toString());
        }
    }
    public void checkProductInCategory (String productName) throws Exception{
        boolean flag = true;
        for (Product product: products) {
            if(product.getName().equals(productName)) flag =false;
        }
        if (flag) throw new Exception("The item isn`t found");

    }
    public  Product getProduct(String productName) throws Exception {
        for ( Product product: products) {
            if(product.getName().equals(productName)) return product;
        }
       throw  new Exception("Don`t exist product");
    }

}
