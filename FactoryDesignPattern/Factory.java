package FactoryDesignPattern;
import java.util.*;
public class Factory {
    public static void main(String[] args) {
        Computer computer=ComputerFactory.getComputerFactory("lenevo");
        computer.work();
    }
}
