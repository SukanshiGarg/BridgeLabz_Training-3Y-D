public class SmartHomeDemo {
    public static void main(String[] args) {
        Thermostat livingRoomThermostat = new Thermostat("T1001", "ON", 24.5);
        Thermostat bedroomThermostat = new Thermostat("T1002", "OFF", 20.0);

        System.out.println("=== Living Room Thermostat ===");
        livingRoomThermostat.displayStatus();

        System.out.println("\n=== Bedroom Thermostat ===");
        bedroomThermostat.displayStatus();
    }
}
