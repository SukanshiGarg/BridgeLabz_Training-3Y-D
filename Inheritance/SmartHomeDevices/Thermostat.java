public class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // call parent constructor
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus(); // show general device info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
