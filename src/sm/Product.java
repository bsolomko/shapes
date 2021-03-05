package sm;

public class Product {
    private String name;
    private double price;
    private double ranking;

    public Product(String name, double price, double ranking) {
        this.name = name;
        this.price = price;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ranking=" + ranking +
                '}';
    }
}
