public class Order {
    private String orderID;
    private NewOrderIDGenerator orderGen;
    
    public Order(NewOrderIDGenerator orderGen2) {
        this.setOrderGen(orderGen2);
        this.orderID = orderGen2.getNextOrderID();
    }
    
    public String getOrderID() {
        return this.orderID;
    }

	public NewOrderIDGenerator getOrderGen() {
		return orderGen;
	}

	public void setOrderGen(NewOrderIDGenerator orderGen) {
		this.orderGen = orderGen;
	}
}
