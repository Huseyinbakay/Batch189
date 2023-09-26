package day14constructorsdatetime;

public class Car {

    //Variable oluşturalım

    String make="Honda";

    String model="Accord";

    int year=2023;

    boolean hybrid=true;

    //methodları oluşturalım



    Car(String make,String model,int year,boolean hybrid){

        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;

    }


    public Car(String make,String model){
        this.make=make;
        this.model=model;

    }


    public Car(boolean hybrid) {
        this.hybrid = hybrid;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void hareket(){

    System.out.println("Honda hızlı ama rahatsızdır");
}


public  void  guvenlik(){
    System.out.println("Hiç de güvenli değildir");
}


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
