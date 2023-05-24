public class Food {
    private int foodId;
    private String foodName;
    private String foodDetail;
    private boolean availableStatus;
    private double price;
    Food(){

    }
    Food(int foodId, String foodName, String foodDetail, boolean availableStatus, double price){
        this.availableStatus = availableStatus;
        this.foodDetail = foodDetail;
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
    }
    public int getId(){
        return foodId;
    }
    public void setid(int id){
        foodId = id;
    }
    public String getName(){
        return foodName;
    }
    public void setName(String name){
        foodName = name;
    }
    public String getDetail(){
        return foodDetail;
    }
    public void setDetail(String detail){
        foodDetail = detail;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public boolean getStatus(){
        return availableStatus;
    }
    public void setStatus(boolean st){
        availableStatus = st;
    }
    public boolean getAvailableStatus(){
        return availableStatus;
    }
    public String getMenuForCus(){
        return "Id: "+getId()+" Name: "+getName()+"\nPrice: "+getPrice();
    }
    @Override
    public String toString() {
        return "Id: "+getId()+"\nName: "+getName()+"\nDetail: "+getDetail()+"\nPrice: "+getPrice()+"\nStatus: "+Boolean.toString(getStatus());
    }
}
