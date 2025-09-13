class Clothing extends Product implements Taxable{
     
    public Clothing(int productId, String name , double price){
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount(){
        return getPrice()*0.10;
    }

    @Override
    public double calculatetax(){
        return getPrice()*0.05;
    }

    @Override
    public String getTaxDetails(){
        return "Tax on Clothing is : 5% ";
    }

    


}
