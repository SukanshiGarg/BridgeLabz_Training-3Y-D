import java.util.*;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C101", "CAR12345", 1000));
        vehicles.add(new Bike("B202", 500, "BIKE6789"));
        vehicles.add(new Truck("T303", 2000, "TRUCK1122"));

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + " (" + v.getVehicleNumber() + ")");
            System.out.println("Rental Cost for " + rentalDays + " days: " + v.calculateRentalCost(rentalDays));

            // 🔹 Polymorphism: treating all as Insurable
            if (v instanceof Insurable) {
                Insurable insurable = (Insurable) v;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println("Insurance Details: " + insurable.getInsuranceDetails());
            }
            System.out.println("------------------------------------------------");
        }
    }
}