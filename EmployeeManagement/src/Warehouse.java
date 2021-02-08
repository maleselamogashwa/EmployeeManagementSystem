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

    public  Warehouse(String productName){
        this.productName = productName;
        this.productBarcode = "000";
        this.productPrice = 0.0;
        this.productQuantity = 0;
        this.productLabel = 0;
    }

    public void setProductLabel(int classCode){
        System.out.println("Enter product classification: 1. Perishable goods/n2. Non-perishable goods/n3. Dangerous goods/n4. Minerals/n5. Chemicals");
        Scanner sc = new Scanner(System.in);
        classCode = sc.nextInt();
        productLabel = classCode;
    }

    public void setProductBarcode(){
        String productCode = productLabel + productBarcode;
    }

    public String getName(String productName){
        return productName;
    }

    public double setProductPrice(double productPrice) {
        this.productPrice = productPrice;
        return productPrice;
    }
}
