package PrototypeDesignPattern;

public class Prototype {
    public static void main(String[] args) {
        Student student1=new Student("vishnu",217);
        Student student2=null;
        try{
        student2=(Student)student1.clone();
        }
        catch(CloneNotSupportedException e){}
        System.out.println(student1.hashCode()+" "+student1);
        System.out.println(student2.hashCode()+" "+student2);
    }
 
    
}
