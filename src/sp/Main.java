package sp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Сategory wine = new Сategory("WINE");
        Сategory beer = new Сategory("BEER");

        wine.addGood(new Goods(100.0, "wine1", 5));
        wine.addGood(new Goods(80.0, "wine2", 4));
        wine.addGood(new Goods(65.0, "wine3", 3));

        beer.addGood(new Goods(20.0, "beer1", 5));
        beer.addGood(new Goods(15.0, "beer2", 4));
        beer.addGood(new Goods(10.0, "beer3", 3));

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER USER name");
        String name = sc.next();
        System.out.println("ENTER USER password");
        String password = sc.next();

        if (name == null || password == null) throw new RuntimeException();
        Basket basket = new Basket();
        User user = new User(name, password, basket);

        System.out.println("CHOICE CATEGORY 1 - WINE,2-BEER");
        int choice = sc.nextInt();
        if (choice != 1 && choice != 2) throw new RuntimeException();

        switch (choice) {
            case 1: {
                wine.printAllGoodsInCategory();
                System.out.println("ENTER name goods for add in BASKET");
                String nameGoods = sc.next();
                if (nameGoods == null) throw new RuntimeException("You don`t enter name goods");

                Goods goods = wine.getGoods(nameGoods);
                user.addGoodsInBasket(goods);
                break;
            }
            case 2: {
                beer.printAllGoodsInCategory();
                System.out.println("ENTER name goods for add in BASKET");
                String nameGoods = sc.next();
                if (nameGoods == null) throw new RuntimeException("You don`t enter name goods");

                Goods goods = wine.getGoods(nameGoods);
                user.addGoodsInBasket(goods);
                break;
            }
            default:
                System.out.println("Error choice");

        }

        user.placeOrder();


    }

}
