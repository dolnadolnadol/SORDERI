public class Customer extends AllOrder{
    private int tableNo;
    private Basket basket;
    Customer(int tableNo){
        this.tableNo = tableNo;
        basket = new Basket();
    }
    public int getTableNo() {
        return tableNo;
    }
    public void CreateOrder(FoodOrder fo){
        basket.addOrder(fo);
    }
    public void sendOrder(){
        super.appendOrder(basket);
    }
    
}
