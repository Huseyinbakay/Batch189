package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Ifstatemensts02 {

    public static void main(String[] args) {


        Scanner  input   =  new Scanner(System.in);

        System.out.println("Lütfen sayı Girin");

        int num  = input.nextInt();

        if(num%2 ==0){
            System.out.println("Çift Sayı");}


        if(num%2 ==1){
            System.out.println("Sayı Tek");
        }


        //sayının çift mi tek mi oldugunu kodla yazdır



        Scanner scan   = new Scanner(System.in);

        System.out.println("Girdiğiniz sayı tek mi Çift mi?");

        int   sayi    = scan.nextInt();

        if(sayi%2==1){
            System.out.println("Sayınız Tek");}




        if (sayi%2==0){
            System.out.println("Girdiğiniz sayı çift");
        }











    }
}
