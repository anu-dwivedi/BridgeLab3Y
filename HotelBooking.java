public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this("Unknown Guest", "Standard", 1); // Default values
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Display method
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    // Example usage
    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("Anya", "Deluxe", 3);
        HotelBooking copiedBooking = new HotelBooking(customBooking);

        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        System.out.println("\nCustom Booking:");
        customBooking.displayBooking();

        System.out.println("\nCopied Booking:");
        copiedBooking.displayBooking();
    }
}


