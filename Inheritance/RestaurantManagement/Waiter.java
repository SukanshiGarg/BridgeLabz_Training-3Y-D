package RestaurantManagement;

public class Waiter extends Person implements Worker {
    private int tableAssigned;

    public Waiter(String name, int id, int tableAssigned) {
        super(name, id);
        this.tableAssigned = tableAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers at table " + tableAssigned);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Waiter");
        System.out.println("Table Assigned: " + tableAssigned);
    }
}

