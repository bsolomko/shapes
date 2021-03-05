package sm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
//        ArrayList<Product> clothes = new ArrayList<Product>();
        List< Product > clothes = new ArrayList();
        clothes.add(new Product("jacket",43,8));
        clothes.add(new Product("t-shirt",12,7));

        List <Product> shoes = new ArrayList<Product>();
        shoes.add(new Product("Trainers",86,10));
        shoes.add(new Product("Slippers",12,6));


       Category clothesCategory =  new Category("clothes",clothes);
       Category shoesCategory = new Category("shoes",shoes);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your login and password:");
        String login = sc.nextLine();
        String password = sc.nextLine();

        Basket basket = new Basket();
        User user = new User(login,password,basket);

        System.out.println("Choose the category(1-clothes,2-shoes):");
        int chose = sc.nextInt();

        switch (chose)
        {
            case 1 : {
                clothesCategory.printAllProductsInCategory();
                System.out.println("Choose the item:");
                String productName = sc.next();
                clothesCategory.checkProductInCategory(productName);
                Product product = clothesCategory.getProduct(productName);
                user.addGoodsInBasket(product);
                break;
            }

            case 2 :{
                shoesCategory.printAllProductsInCategory();
                String productName = sc.next();
                shoesCategory.checkProductInCategory(productName);
                Product product = shoesCategory.getProduct(productName);
                user.addGoodsInBasket(product);
                break;
            }

            default:
                System.out.println("Invalid number");
                break;
        }

        System.out.println(basket.toString());

    }
}
