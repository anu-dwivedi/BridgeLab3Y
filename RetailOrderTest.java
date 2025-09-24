// Base class: Order
class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped (Tracking Number: " + trackingNumber + ")";
    }
}

// Subclass: DeliveredOrder extends ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

// Test class
public class RetailOrderTest {
    public static void main(String[] args) {
        Order order = new Order("101", "2025-09-21");
        System.out.println(order.getOrderStatus());

        ShippedOrder shipped = new ShippedOrder("102", "2025-09-20", "TRACK123456");
        System.out.println(shipped.getOrderStatus());

        DeliveredOrder delivered = new DeliveredOrder("103", "2025-09-19", "TRACK654321", "2025-09-22");
        System.out.println(delivered.getOrderStatus());
    }
}