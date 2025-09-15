package VehicleManagementSystem;

public class VehicleDemo {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 75);
        PetrolVehicle pv = new PetrolVehicle("Honda Civic", 220, 50);

        System.out.println("=== Electric Vehicle Info ===");
        ev.displayInfo();
        ev.charge();

        System.out.println("\n=== Petrol Vehicle Info ===");
        pv.displayInfo();
        pv.refuel();
    }
}

