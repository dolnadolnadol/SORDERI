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
            if(i.getFoodId()==fo.getFoodId()){
                i.setAmount(i.getAmount()+fo.getAmount());
                i.setAllPriceThisOrder((i.getAllPriceThisOrder()+fo.getAllPriceThisOrder()));
                return;
            }
        }
        foodOrder.add(fo);
        System.out.println("in");
    }
}
