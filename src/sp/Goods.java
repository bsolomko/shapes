package sp;

public class Goods {
    private Double price;
    private String name;
    private Integer rating;

    public Goods(Double price, String name, Integer rating) {
        this.price = price;
        this.name = name;
        this.rating = rating;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
