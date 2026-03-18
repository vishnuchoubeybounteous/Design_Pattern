package SingletonDesignPattern;

//eager singleton
public class Laptop {
    private static Laptop laptop=new Laptop();
    private Laptop(){};
    public static Laptop getLaptop(){
         return laptop;
    }
}
