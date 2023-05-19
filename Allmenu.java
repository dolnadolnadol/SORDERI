package SORDERI;
import java.util.ArrayList;

public class Allmenu {
    private ArrayList<Food> food = new ArrayList<>();
    Allmenu(){

    }
    public void addMenu(Food f){
        food.add(f);
    }
    public void getAllmenu(){
        for(Food i : food){
            System.out.println(i.toString()+"\n");
        }
    }
}
