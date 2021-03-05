package sp;

import java.util.Objects;

public class Goods {
    private final Double price;
    private final String name;
    private final Integer rating;

    public Goods(Double price, String name, Integer rating) {
        this.price = price;
        this.name = name;
        this.rating = rating;
    }

    public Double getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }


    public Integer getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(price, goods.price) && Objects.equals(name, goods.name) && Objects.equals(rating, goods.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, rating);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
