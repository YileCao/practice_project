public class Pizzeria {
    public String storeName;
    public String storeAddress;
    public String pizzaPrice;
    public String pizzaIngredients;

    public long storePhone;
    public String storeEmail;
    public String storeMenu;

    private String orderID;
    private String sides;
    private String drinks;
    private double orderTotal;

    public void takeOrder(String ID, double Total, String side, String drink, String Ingredients){
        orderID = ID;
        orderTotal = Total;
        pizzaIngredients = Ingredients;
        sides = side;
        drinks = drink;
      

        System.out.println("Order accepted!");

        System.out.println("Order is being prepared");

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
        }

        System.out.println("Your order is ready!");

        makePizza();

    }


    public void makePizza(){

        
        System.out.println("Your pizza is being prepared. Please wait");

        System.out.println("Your delicious pizza is ready");
        
        printReceipt();
    }
    
    private void printReceipt(){
        System.out.println("********RECEIPT********");

        System.out.println("Order ID: " + orderID);

        System.out.println("Order Total: " + orderTotal);
    }
    
}
