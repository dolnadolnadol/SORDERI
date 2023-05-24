public class FoodOrder{
    private Food food;
    private int amount;
    private double allPriceThisOrder;

    FoodOrder(Allmenu alme, int id, int amount){
        if(!check(alme, id)){
            System.out.println("cant find "+id+" menu. ");
        }
        else{
            this.amount = amount;
            allPriceThisOrder = getAmount()*food.getPrice();
        }
        
    }
    private boolean check(Allmenu alme, int id){
        for(Food i : alme.getFood()){
            if(i.getId()==id){
                food = i;
                return true;
            }
        }
        return false;
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
    public void setAllPriceThisOrder(double allPriceThisOrder) {
        this.allPriceThisOrder = allPriceThisOrder;
    }
    public double getAllPriceThisOrder(){
        return allPriceThisOrder;
    }
    
}
