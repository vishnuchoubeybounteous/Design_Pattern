package SingletonDesignPattern;

public class Computer {
    private static volatile Computer computer;
    private Computer(){}
    public static Computer getComputer(){
        if(computer==null){
            synchronized(Computer.class){
             if(computer==null){
            computer=new Computer();
            return computer;
             }
            }
        }
        return computer;
    }
}
