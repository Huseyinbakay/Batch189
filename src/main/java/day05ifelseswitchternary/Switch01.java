package day05ifelseswitchternary;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        //Gün ismi verince kaçıncı gün oşduğunu yazdıran kod ayzınız


        Scanner input  = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");

        String dayName = input.next();


        switch (dayName.toLowerCase()){
            case "monday":
                System.out.println(1);
                break;

            case "tuesday":
                System.out.println(2);
                break;

            case "wednesday":
                System.out.println(3);
                break;

            case "thursday":
                System.out.println(4);
                break;

            case "friday":
                System.out.println(5);
                break;

            case "sturday":
                System.out.println(6);
                break;

            case "sunday":
                System.out.println(7);
                break;

             default:
                 System.out.println("data is wrong");


        }












    }
}
