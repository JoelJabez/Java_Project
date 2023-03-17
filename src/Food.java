public class Food {
    int quantity;
    String nameOfFood;

    public Food(){
        this(null, 0);
    }

    public Food(String nameOfFood){
        this.nameOfFood = nameOfFood;
    }


    public Food(String nameOfFood, int quantity){
        this.nameOfFood = nameOfFood;
        this.quantity = quantity;
    }

    public static int add(int x, int y){
        return x + y;
    }

    public void hello(){
        System.out.println("Hello world");
    }

   public static void bought(Name name){
       System.out.printf("%s bought a food\n", name);
   }
}
