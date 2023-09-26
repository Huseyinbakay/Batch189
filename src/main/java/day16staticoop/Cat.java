package day16staticoop;
public class Cat extends Animal{
    public static void main(String[] args) {

        Cat c1=new Cat();

        c1.eat();
        c1.drink();
        c1.meow();

        //Altta dikkat ettin mi sadece meow var altta methodda.Ama c1 e drink de koydum eat da koydum.Animal classtan

        //dog class a git sadece meov methodu farklı.

    }
    public  void  meow(){

        System.out.println("meow");
    }


}
