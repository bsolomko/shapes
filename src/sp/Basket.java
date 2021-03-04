package sp;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Goods> goodsInBasket = new ArrayList<>();

    public void addGoodsInBasket( Goods g){
        goodsInBasket.add(g);
    }

    public Integer getCountsGoodsInBasket(){
        return goodsInBasket.size();
    }
    public void showGoodsInBasket(){
        System.out.println("GOODS IN BASKET:");
        for (Goods g:goodsInBasket) {
            System.out.println(g.getName());
            System.out.println(g.getPrice());
            System.out.println(g.getRating());
        }
    }
    public ArrayList<Goods> getGoodsInBasket(){
        return  goodsInBasket;
    }

}
