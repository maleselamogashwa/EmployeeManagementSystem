public class Main {
    public static void main(String[] args){
        Warehouse product1 = new Warehouse();

        System.out.println("---------------------------------------------------------------");
        product1.setProductName("Chair");
        product1.setProductLabel();
        product1.setProductBarcode();
        product1.setProductQuantity(50);
        product1.setProductPrice(35.0);

        System.out.println("---------------------------------------------------------------");


    }
}
