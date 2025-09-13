class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate() * 0.9; // 10% discount for bikes
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of rentalRate
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}