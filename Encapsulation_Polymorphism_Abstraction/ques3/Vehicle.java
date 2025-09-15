
public abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String number, String type, double rate) {
        this.vehicleNumber = number;
        this.type = type;
        this.rentalRate = rate;
    }

    // Encapsulation
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayDetails() {
        System.out.println("Vehicle: " + type + ", Number: " + vehicleNumber + ", Rate/Day: " + rentalRate);
    }
}


