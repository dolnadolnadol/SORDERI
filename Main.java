public class Main{
    public static void main(String[] agrs){
        Allmenu allmenu = new Allmenu();
        allmenu.addMenu(new Food(1,"krapao","mou and veg",true,50));
        allmenu.addMenu(new Food(2,"krapao","mou and veg",true,50));
        allmenu.getAllmenu();

    }
}