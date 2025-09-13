abstract class Product {

    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name , double price){
         this.productId= productId;
         this.name= name;
         this.price= price;
    }

    public int getProductId(){
        return productId;
    }

    public String getName(){
        return name;
    }
    
    public double getPrice (){
        return price;
    }

    
    public void setPrice(double price){
        this.price= price;
    }


    public abstract double calculateDiscount();
}


//imutable fields - id and name yeh ek baar fix hopgyi fir baar change nahi karenge   (only getter )

//mutable fields - price will change as per discounts and offers  (getters+setter)