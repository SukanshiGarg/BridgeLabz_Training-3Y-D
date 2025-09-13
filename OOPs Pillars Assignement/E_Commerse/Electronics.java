

class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name , double price){
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount(){
      return getPrice()*0.10;
 }

    @Override
    public double calculatetax(){
       return getPrice()*0.80;
    }
     

    @Override
     public String getTaxDetails(){
       return "Electronics Gst : 18 % GST";
     }
}

