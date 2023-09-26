package day17oop;

public class Car extends Vehicle {
    public static void main(String[] args) {

    }

    public Car(){

        System.out.println("Car 1");
    }

    public Car(String make){
        super(1000);
        System.out.println("Car 2");
    }

    public  String model="Accord";

    public int km=20000;



}
