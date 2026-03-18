package PrototypeDesignPattern;

//Shallow copy

public class Student implements Cloneable {
    private String name;
    private int rollno;
    public Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    @Override
    public Student clone() throws CloneNotSupportedException{
        return (Student)super.clone();
    }
   
    @Override
    public String toString(){
        return name+" "+rollno;
    }
    

}
