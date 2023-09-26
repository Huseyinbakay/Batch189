package day22mapexception;

public class E07 {
    public static void main(String[] args) {

        age(65);
        age(312);
        age(-5);


    }

    public static void age(int age) {
        if (age<0){
            throw new IllegalArgumentException("Yaş eksi olamaz");

        }else System.out.println(age);

    }

}