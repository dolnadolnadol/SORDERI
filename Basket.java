package SORDERI;
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
        foodOrder.add(fo);
    }
}
