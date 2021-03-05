package sm;

import java.util.Objects;

public class Product {
    final private String name;
    final private double price;
    final private double ranking;

    public Product(String name, double price, double ranking) {
        this.name = name;
        this.price = price;
        this.ranking = ranking;
    }



    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public double getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ranking=" + ranking +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Double.compare(product.ranking, ranking) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, ranking);
    }
}
