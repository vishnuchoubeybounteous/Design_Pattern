package SingletonDesignPattern;
//lazy singleton
public class Monitor {
    static Monitor monitor;
    private Monitor(){}
    static Monitor getMonitor(){
        if(monitor==null)
        monitor=new Monitor();
        return monitor; 
    }
}
