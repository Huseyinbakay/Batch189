package day16staticoop;

public class Bird extends Animal {
    public static void main(String[] args) {

        Bird b1=new Bird();

        b1.eat();
        b1.drink();
        b1.tweet();

    }



    public  void tweet(){

        System.out.println("cik cik");
    }
}
