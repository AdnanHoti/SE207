public class NewOrderIDGenerator {
    private static NewOrderIDGenerator instance = null;
    private int id = 0;
    private String prefix = "XY-";
    
    private NewOrderIDGenerator() {}
    
    public static NewOrderIDGenerator getInstance() {
        if (instance == null) {
            instance = new NewOrderIDGenerator();
        }
        return instance;
    }
    
    public synchronized String getNextOrderID() {
        id++;
        return (prefix + id);
    }
}
