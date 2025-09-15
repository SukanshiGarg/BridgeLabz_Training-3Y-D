package RestaurantManagement;

public class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking. Specialty: " + specialty);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
    }
}

