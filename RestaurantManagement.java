// Superclass: Person
class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties();
}

// Subclass: Chef extends Person and implements Worker
class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious meals.");
    }
}

// Subclass: Waiter extends Person and implements Worker
class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

// Test class
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Rahul", 101);
        Waiter waiter = new Waiter("Anita", 102);

        chef.displayInfo();
        chef.performDuties();

        waiter.displayInfo();
        waiter.performDuties();
    }
}