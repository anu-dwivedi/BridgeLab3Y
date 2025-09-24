public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 1500.0; // ₹1500 per day

    // Default constructor
    public CarRental() {
        this("Unknown Customer", "Standard", 1);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return DAILY_RATE * rentalDays;
    }

    // Display rental details
    public void displayRentalInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    // Example usage
    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental customRental = new CarRental("Anya", "Hyundai Creta", 5);

        System.out.println("Default Rental:");
        defaultRental.displayRentalInfo();

        System.out.println("\nCustom Rental:");
        customRental.displayRentalInfo();
    }
}

