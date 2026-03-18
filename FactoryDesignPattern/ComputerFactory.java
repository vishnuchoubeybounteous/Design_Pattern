package FactoryDesignPattern;

public class ComputerFactory {
    
    public static Computer getComputerFactory(String str){

            if(str == null){
                throw new IllegalArgumentException("Input cannot be null");
            }
             else if(str.trim().equalsIgnoreCase("Asus")){
                return new Asus();
             }
             else if(str.trim().equalsIgnoreCase("Lenevo")){
                return new Lenevo();
             }
             throw new IllegalArgumentException("No dev available");
    }
}
