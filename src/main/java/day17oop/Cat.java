package day17oop;

public class Cat extends Animal{

    public void meow(){

        System.out.println("Cats meow");
    }

    @Override
    public void drink() {
        System.out.println("cats drink");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }
}
