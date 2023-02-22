public class OrderTester {
    public static void main(String[] args) {
        NewOrderIDGenerator orderGen = NewOrderIDGenerator.getInstance();
        
        Order order1 = new Order(orderGen);
        System.out.println("Order 1 ID: " + order1.getOrderID());
        
        Order order2 = new Order(orderGen);
        System.out.println("Order 2 ID: " + order2.getOrderID());
        
        Order order3 = new Order(orderGen);
        System.out.println("Order 3 ID: " + order3.getOrderID());
    }
}
