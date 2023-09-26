package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner04 {


    public static void main(String[] args) {




/*package day04scannerincrementdecrementifstatements;

        public class Scanner04 {
            public static void main(String[] args) {

                //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
                //rakamlarin toplamini yazdiran kodu yaziniz
                //           45678 ==> 45 + 78 = 123*/


         Scanner input  = new Scanner(System.in);

        System.out.println("Lütfen 5 Basamaklı bir sayı giriniz");

        int  girdi  = input.nextInt();

        int girdiİlk  = girdi/1000;

        int girdiSon  = girdi%100;

        System.out.println(girdiİlk+girdiSon);









    }
}
