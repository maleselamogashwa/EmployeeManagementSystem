public class Customer {
//Place an order
//View order details
//Cancel pending order
//View previous order transaction
    private int customerID;
    private String customerName;
    private String company;
    private int orderID;

    public Customer(int customerID, int orderID){
        this.customerID = customerID;
        this.orderID = orderID;

    }

}
