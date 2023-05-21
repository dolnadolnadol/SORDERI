// import java.util.ArrayList;

public class Customer extends AllOrder{
    private int tableNo;
    private Basket basket;
    // private ArrayList<FoodOrder> fOr = new ArrayList<>();
    Customer(int tableNo){
        this.tableNo = tableNo;
        basket = new Basket();
    }
    public int getTableNo() {
        return tableNo;
    }
    // public void setfOr(FoodOrder fOr) {
    //     this.fOr.add(fOr);
    // }
    public void CreateOrder(FoodOrder fo){
        basket.addOrder(fo);
    }
    public void sendOrder(){
        super.appendOrder(basket);
        basket = new Basket();
    }
    
}
