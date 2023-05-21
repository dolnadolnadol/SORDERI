public class Main{
    public static void main(String[] agrs){
        Allmenu allmenu = new Allmenu();
        allmenu.addMenu(new Food(1,"krapao","mou and veg",true,50));
        allmenu.addMenu(new Food(2,"krapao","mou and veg",true,50));
        // allmenu.getAllmenu();

        Customer cs1 = new Customer(15);
        cs1.CreateOrder(new FoodOrder(allmenu, 2, 50));
        cs1.sendOrder();
        cs1.getFo();

        Customer cs2 = new Customer(15);
        cs2.CreateOrder(new FoodOrder(allmenu, 1, 1));
        cs2.CreateOrder(new FoodOrder(allmenu, 1, 2));
        cs2.CreateOrder(new FoodOrder(allmenu, 1, 3));
        cs2.CreateOrder(new FoodOrder(allmenu, 1, 4));
        cs2.CreateOrder(new FoodOrder(allmenu, 1, 5));
        cs2.CreateOrder(new FoodOrder(allmenu, 2, 1));
        cs2.sendOrder();
        cs2.getFo();

    }
}