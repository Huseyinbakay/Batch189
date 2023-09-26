package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Ifstatements01 {

    public static void main(String[] args) {

      /*package day04scannerincrementdecrementifstatements;

public class IfStatements01 {
    public static void main(String[] args) {
        //if Statements
        //bazi kodlarin bazi sartlara gore aktive edebilmek icin if statements kullanilir.

        // if you study hard, you will learn java.   ==> English


        if (you study hard){
            you will learn java      ====> java
        }


    //Ornek 1:  Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin

   /* int number = 13;

        if (number > -1 && number < 10) {
        System.out.println("Rakam");*/


        Scanner  input  = new Scanner(System.in);

        System.out.println("Lütfen sayı giriniz");

        int sayi =input.nextInt();

        if(sayi<10&&sayi>-1){
        System.out.println("Rakam");}

        if (sayi<-1||sayi>10){
            System.out.println("yanlış hayatım");

            Scanner  girdi  =  new Scanner(System.in);

            System.out.println("Emekli misin");

            boolean  emekli   = girdi.nextBoolean();

            if(emekli=true){
                System.out.println("Yalan söyleme");}

            if(emekli=false){
                System.out.println("Dogru cevabin için teşekkürler");

            }









        }













    }








}
