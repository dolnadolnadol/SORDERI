import java.util.ArrayList;

public class Allmenu {
    private ArrayList<Food> food = new ArrayList<>();
    Allmenu(){

    }
    public void addMenu(Food f){
        food.add(f);
        System.out.println("AddMenu "+f.getName()+" in Allmenu Complete.");
    }
    public void getAllmenu(){
        for(Food i : food){
            System.out.println(i.toString()+"\n");
        }
    }
    public ArrayList<Food> getFood(){
        return food;
    }
}
