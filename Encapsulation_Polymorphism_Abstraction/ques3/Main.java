
public class Main {
    public static void processVehicle(Vehicle vehicle, int days) {
        vehicle.displayDetails();
        double rent = vehicle.calculateRentalCost(days);
        System.out.println("Rental Cost for " + days + " days: ₹" + rent);

        if (vehicle instanceof Insurable) {
            Insurable ins = (Insurable) vehicle;
            double insurance = ins.calculateInsurance();
            System.out.println(ins.getInsuranceDetails() + " | Cost: ₹" + insurance);
            System.out.println("Total Payable: ₹" + (rent + insurance));
        }

        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car("MH12AB1234", 1500);
        Vehicle v2 = new Bike("MH14XY5678", 500);
        Vehicle v3 = new Truck("MH16PQ9012", 3000);

        // Polymorphism in action
        processVehicle(v1, 5);
        processVehicle(v2, 3);
        processVehicle(v3, 7);
    }
}

