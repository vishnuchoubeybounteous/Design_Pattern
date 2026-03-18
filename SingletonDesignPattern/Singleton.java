package SingletonDesignPattern;

public class Singleton{
    public static void main(String[] args) {
        Monitor monitor1=Monitor.getMonitor();
        Monitor monitor2=Monitor.getMonitor();
        System.out.println(monitor1.hashCode());
        System.out.println(monitor2.hashCode());
    }

}