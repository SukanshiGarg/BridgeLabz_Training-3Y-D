// File: Bike.java
public class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) {
        super(number, "Bike", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: ₹500";
    }
}

