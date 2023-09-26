package day09loops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {


         /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */


        Scanner input = new Scanner(System.in);




        do {

            System.out.println("Lütfen bir sayı giriniz");

            int a =input.nextInt();


            if (a>=100){
                System.out.println("Kazandınız");




            }else {
                System.out.println("Kaybettiniz");
                break;
            }




        }while (true);






    }
}
