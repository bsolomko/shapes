package sp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Сategory {

    private final String name;
    private final List<Goods> goods;

    public Сategory(String name) {
        this.name = name;
        this.goods = new ArrayList<>();
    }

    public void addGood(Goods g) {
        goods.add(g);
    }

    public Goods getGoods(String name) {
        for (Goods g : goods) {
            if (g.getName().equals(name)) return g;
        }
        throw new RuntimeException("Don`t find goods by name");
    }

    public String getName() {
        return name;
    }

    public void printAllGoodsInCategory() {

        System.out.println("Category: " + getName());
        for (Goods g : goods) {
            System.out.println("NAME :" + g.getName());
            System.out.println("PRICE :" + g.getPrice());
            System.out.println("RATING :" + g.getRating());
            System.out.println("_________________");

        }
    }

    public void checkGoodsInCategory(String goodsName) {
        boolean flag = true;
        for (Goods g : goods) {
            if (g.getName().equals(goodsName)) flag = false;
        }
        if (flag) throw new RuntimeException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Сategory сategory = (Сategory) o;
        return Objects.equals(name, сategory.name) && Objects.equals(goods, сategory.goods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, goods);
    }

    @Override
    public String toString() {
        return "Сategory{" +
                "name='" + name + '\'' +
                ", goods=" + goods.toString() +
                '}';
    }
}
