package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {


        //Example 2: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı gün olduğunuzu giriniz");


        byte sayi = input.nextByte();


        if (sayi == 1) {
            System.out.println("Monday");

        } else if (sayi == 2) {
            System.out.println("Tuesday");
        } else if (sayi == 3) {
            System.out.println("Wednesday");
        } else if (sayi == 4) {
            System.out.println("Thursday");

        } else if (sayi==5) {
            System.out.println("Friday");

        }else if (sayi==6){
            System.out.println("SAturday");
        } else if (sayi==7) {
            System.out.println("Sunday");

        }
    }

}


















