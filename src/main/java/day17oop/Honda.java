package day17oop;

public class Honda extends Car {
    public static void main(String[] args) {



    }


    public Honda(){

        System.out.println(super.model);
        System.out.println("Honda civic");
        System.out.println("super.km = " + super.km);
        System.out.println("super.model = " + super.model);
        System.out.println("this.km = " + this.km);
        System.out.println("this.model = " + this.model);
    }

public  Honda(String model,int year){
        super("honda 2");
    System.out.println("Honda 2");
}


public  String model="Civic";

    public int km=10000;

}
