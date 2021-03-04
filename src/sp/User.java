package sp;

public class User {

    private String name;
    private String password;
    private  Basket basket;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.basket = new Basket();
    }

    public void addGoodsInBasket( Goods g){
        basket.addGoodsInBasket(g);
    }
    public void placeOrder(){
        double sum =0.0;
        System.out.println("LIST OF GOODS");
        for ( Goods g: basket.getGoodsInBasket()) {
            System.out.println("NAME : " + g.getName());
            System.out.println("PRICE : " + g.getPrice());
            sum+= g.getPrice();
        }
        System.out.println("THANKS FOR ORDER");
        System.out.println("TOTAL PRICE : " + sum);

    }
}
