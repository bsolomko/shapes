package sp;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Goods> goods = new ArrayList<>();

    public void addGoods(Goods goods) {
        this.goods.add(goods);
    }

    public int getBasketSize() {
        return goods.size();
    }

    public void showGoodsInBasket() {
        System.out.println("GOODS IN BASKET:");
        for (Goods g : goods) {
            System.out.println(g.getName());
            System.out.println(g.getPrice());
            System.out.println(g.getRating());
        }
    }

    public List<Goods> getGoods() {
        return goods;
    }

}
