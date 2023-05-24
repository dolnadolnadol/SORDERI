import java.util.ArrayList;

public class Basket {
    ArrayList<FoodOrder> foodOrder = new ArrayList<>();    
    Customer cs;
    Basket(){
    
    }
    public void setFd(FoodOrder fd) {
        foodOrder.add(fd);
    }
    public ArrayList<FoodOrder> getFoodOrder() {
        return foodOrder;
    }
    public Customer getCs() {
        return cs;
    }
    public void addOrder(FoodOrder fo){
        for(FoodOrder i : foodOrder){
            if(fo.getFood()==null){
                return;
            }
            if(!i.getFood().getAvailableStatus()){
                System.out.println(i.getFood().getId()+" Food Not Available.");
                return;
            }
            else if(i.getFood().getId()==fo.getFood().getId() && i.getFood().getAvailableStatus()){
                i.setAmount(i.getAmount()+fo.getAmount());
                i.setAllPriceThisOrder((i.getAllPriceThisOrder()+fo.getAllPriceThisOrder()));
                System.out.println("\naddOrder in Basket complete.");
                return;
            }
        }
        if(fo.getFood().getAvailableStatus()){
            foodOrder.add(fo);
        }
        else{
            System.out.println("\n" + fo.getFood().getId()+" Food Not Available.");
        }   
    }
}
