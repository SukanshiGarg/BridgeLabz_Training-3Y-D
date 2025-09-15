// File: Car.java
public class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, "Car", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 2000; // fixed insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: ₹2000";
    }
}
}
