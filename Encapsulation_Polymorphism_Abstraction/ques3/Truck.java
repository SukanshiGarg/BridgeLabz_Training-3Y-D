
public class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 5000; // fixed insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: ₹5000";
    }
}

