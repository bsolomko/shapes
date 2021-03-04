package sp;

import java.util.ArrayList;
import java.util.Objects;

public class Сategory {

    final  private String name;
    final private ArrayList<Goods> goods;

    public Сategory(String name) {
        this.name = name;
        this.goods = new ArrayList<>();
    }
    public void addGood(Goods g){
        goods.add(g);
    }

    public Goods getGoods( String name){
        for (Goods g: goods) {
            if(g.getName().equals(name)) return g;
        }
        throw new RuntimeException();
    }

    public String getName() {
        return name;
    }

    public void getAllGoodsInCategory(){

        System.out.println("Category: " + getName());
        for ( Goods g: goods) {
            System.out.println("NAME :" + g.getName());
            System.out.println("PRICE :" + g.getPrice());
            System.out.println("RATING :" + g.getRating());
            System.out.println("_________________");

        }
    }

    public boolean checkGoodsInCategory(String goodsName){
        for ( Goods g: goods) {
            if(g.getName() == goodsName) return true;
        }
             throw new RuntimeException();
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
