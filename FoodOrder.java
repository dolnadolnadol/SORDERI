public class FoodOrder {
    private Food food;
    private int amount;
    
    FoodOrder(Food f, int amount){
        food = f;
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Food getFood() {
        return food;
    }
    public void setFood(Food food) {
        this.food = food;
    }
    
}
