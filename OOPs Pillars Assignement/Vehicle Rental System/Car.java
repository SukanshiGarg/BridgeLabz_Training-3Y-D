class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, String type, double rentalRate){
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    
    @Override
    public double calculateRentalCost(int days){
        return days*getRentalRate();
    }

    @Override
    public double calculateInsurance(){
       return getRentalRate()*0.15;
    }

    @Override
    public String getInsuranceDetails(){
     return "Car Insurance Policy : ***** "+ insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }

    
}
