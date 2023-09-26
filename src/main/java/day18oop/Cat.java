package day18oop;

public class Cat extends Animal {

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


    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Cat create() {
        return new Cat();




    }


    @Override
    public Integer multiplay(Integer a, Integer b) {
        return a*b;
    }
}
