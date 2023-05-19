import java.util.ArrayList;

public class AllOrder {
    private ArrayList<FoodOrder> fo = new ArrayList<>();
    private double sumPrice = 0;

    public void appendOrder(Basket bs){
        for(FoodOrder i : bs.getFoodOrder()){
            fo.add(i);
            sumPrice += i.getFood().getPrice();
        }
    }
    public double getSumPrice() {
        return sumPrice;
    }
    public void getFo() {
        for(FoodOrder i : fo){
            System.out.println(i.getFood().toString()+"\nAmount: "+i.getAmount()+"\nSummaryPrice: "+getSumPrice());
            System.out.println();
        }
    }

}
