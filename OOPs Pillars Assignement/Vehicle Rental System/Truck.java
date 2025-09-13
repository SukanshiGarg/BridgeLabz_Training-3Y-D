class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate() + 500; // extra fixed maintenance charge
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.20; // 20% of rentalRate
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}