package sm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> clothes = new ArrayList<Product>();
        clothes.add(new Product("jacket",43,8));
        clothes.add(new Product("t-shirt",12,7));

        ArrayList<Product> shoes = new ArrayList<Product>();
        shoes.add(new Product("Trainers",86,10));
        shoes.add(new Product("Slippers",12,6));


        ArrayList<Category> category1 = new ArrayList<Category>();
        category1.add(new Category("clothes",clothes));

        ArrayList<Category> category2 = new ArrayList<Category>();
        category2.add(new Category("shoes",shoes));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your login and password:");
        String login = sc.nextLine();
        String password = sc.nextLine();
        User user = new User(login,password);

        System.out.println("Choose the category(1-clothes,2-shoes):");
        int chose = sc.nextInt();

        switch (chose)
        {
            case 1 :
                for(Category x:category1)
                    System.out.println(x.toString());

                    System.out.println("Choose the item(1-2):");
                    int chose2 = sc.nextInt();
                    switch (chose2)
                    {
                        case 1 :
                            System.out.println(clothes.get(0));
                            break;
                        case 2 :
                            System.out.println(clothes.get(1));
                            break;
                        default:
                            System.out.println("Invalid number");
                            break;
                    }
                    break;
            case 2 :
                for(Category x:category2)
                    System.out.println(x.toString());
                System.out.println("Choose the item(1-2):");
                int chose3 = sc.nextInt();
                switch (chose3)
                {
                    case 1 :
                        System.out.println(shoes.get(0));
                        break;
                    case 2 :
                        System.out.println(shoes.get(1));
                        break;
                    default:
                        System.out.println("Invalid number");
                        break;
                }
                break;
            default:
                System.out.println("Invalid number");
                break;
        }


    }
}
