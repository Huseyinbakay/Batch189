package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner02 {


    public static void main(String[] args) {



/*
public cl/*ass Scanner02 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz*/


        Scanner input    =  new Scanner(System.in);

        System.out.println("Lütfen iki sayı giriniz");

       double firsNumber  = input.nextDouble();
        double  secondNumber= input.nextDouble();

        System.out.println("Toplam  ="+ (firsNumber+secondNumber));
        System.out.println("Fark  ="+ (firsNumber-secondNumber));
        System.out.println("Çarpım  ="+ (firsNumber*secondNumber));
        System.out.println("Bölüm  ="+ (firsNumber/secondNumber));


    }
}
