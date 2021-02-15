import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse {
//view products in stock
//add products to current stock
//remove products from stock
//set price of product

    private String productName;
    private String productBarcode;
    private double productPrice;
    private int productQuantity;
    private int productLabel;

    public  Warehouse(){
        this.productName = null;
        this.productBarcode = "000"; // Last digit of the barcode should be its index number in an array. Two middle digits should customerId
        this.productPrice = 0.0;
        this.productQuantity = 0;
        this.productLabel = 0;
    }

    public void setProductName(String productName){
        ArrayList<String> product = new ArrayList<String>();
        product.add(productName);
        System.out.println("Your product" + " " + productName +  " " +"has been added to inventory");
        System.out.println("Available in inventory =  " + " " + product);

    }

    public void setProductLabel(){
        System.out.println("Enter product classification:\n1. Perishable goods\n2. Non-perishable goods\n3. Dangerous goods\n4. Minerals\n5. Chemicals");
        Scanner sc = new Scanner(System.in);
        productLabel = sc.nextInt();
        System.out.println("Product has been classified under category " + " " + productLabel);
    }

    public void setProductBarcode(){

        String productCode = productLabel + productBarcode;
        System.out.println("Product barcode is " + productCode);
    }

    public void setProductQuantity(int productQuantity){
        System.out.println("Quantity available in stock =" + " " + productQuantity);
    }

    public void setProductPrice(double productPrice) {
        final double valueAddedTax = 0.15;
        this.productPrice = productPrice + (productPrice * valueAddedTax);
        System.out.println("Cost per unit price = " + " " + "R" +productPrice + " incl. 15% VAT");
    }
}
