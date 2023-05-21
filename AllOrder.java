import java.util.ArrayList;

public class AllOrder {
    private ArrayList<FoodOrder> fo = new ArrayList<>();
    private double sumPrice = 0;

    public void appendOrder(Basket bs){
        for(FoodOrder i : bs.getFoodOrder()){
            fo.add(i);
            sumPrice += i.getAllPriceThisOrder();
        }
    }
    public double getSumPrice() {
        return sumPrice;
    }
    public void getFo() {
        for(FoodOrder i : fo){
            System.out.println(i.getFood().getMenuForCus()+"\nAmount: "+i.getAmount()+"\nSummaryPrice: "+i.getAllPriceThisOrder());
            System.out.println();
        }
        System.out.println(getSumPrice());
    }

}
