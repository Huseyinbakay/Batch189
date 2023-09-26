package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner01 {


    public static void main(String[] args) {


           /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Adınızı ve Soyadınızıgiriniz");

        String   fullName   =  input.nextLine();

        System.out.println("Yaşınızı Giriniz");

        byte   age  =  input.nextByte();

        System.out.println("Boyunuzu giriniz");

        float   height   =  input.nextFloat();

        System.out.println("Kilonuzu Giriniz");

        short   weight   =   input.nextShort();

        System.out.println("Medeni Durum");

        String  maritalStatus =   input.next();

        System.out.println("fullName = " + fullName);

        System.out.println("age = " + age);


        System.out.println("height = " + height);

        System.out.println("weight = " + weight);



    }


}
