package sp;

import java.util.ArrayList;

public class Сategory {

    private String name;
    private ArrayList<Goods> goods;

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
        return null;
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

    public boolean checkGoodsInCategory(String nameGoods){
        for ( Goods g: goods) {
            if(g.getName() == nameGoods) return true;
        }
        return  false;
    }
}
