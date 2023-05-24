import java.util.ArrayList;

public class AllOrder extends Payment{
    private ArrayList<FoodOrder> fo = new ArrayList<>();
    private double sumPrice = 0;

    public void appendOrder(Basket bs){
        for(FoodOrder i : bs.getFoodOrder()){
            if(i.getFood().getAvailableStatus()){
                fo.add(i);
                sumPrice += i.getAllPriceThisOrder();
                return;
            }
        }
    }
    public double getSumPrice() {
        return sumPrice;
    }
    public void getFo() {
        System.out.println("\nAllOrder that you order :");
        for(FoodOrder i : fo){
            System.out.println(i.getFood().getMenuForCus()+"\nAmount: "+i.getAmount()+"\nPrice This Order: "+i.getAllPriceThisOrder()+" Baht.");
            System.out.println();
        }
        System.out.println("SumaryPrice: " + getSumPrice());
    }

}
