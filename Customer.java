public class Customer extends AllOrder{
    private int tableNo;
    private Basket basket;
    private Allmenu alme;

    Customer(int tableNo){
        this.tableNo = tableNo;
        basket = new Basket();
    }
    public void setAlme(Allmenu al) {
        alme = al;
    }
    public Allmenu getAlme() {
        return alme;
    }
    public int getTableNo() {
        return tableNo;
    }
    public void CreateOrder(FoodOrder fo){
        basket.addOrder(fo);
    }
    public void sendOrder(){
        super.appendOrder(basket);
        basket = new Basket();
    }
    
}
