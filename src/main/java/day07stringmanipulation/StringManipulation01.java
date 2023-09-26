package day07stringmanipulation;

import java.util.Scanner;

public class StringManipulation01 {

    public static void main(String[] args) {


        /*package day07stringmanipulations;

public class StringManipulation01 {

    public static void main(String[] args) {

            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun*/


        Scanner    input   = new Scanner(System.in);


        System.out.println("Lütfen passwor giriniz");

        String  pwd    =input.nextLine();



// i)En az 8 character olsun

        boolean  lengthcontrol  =pwd.length()>7;

        System.out.println("lengthcontrol = " + lengthcontrol);


        //ii)Space characteri password'de olmasin

        boolean spaceControl = !pwd.contains(" ");
        System.out.println("spaceControl = " + spaceControl);


        //iii)En az bir tane buyuk harf olsun



        boolean   upperCase  = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("upperCase = " + upperCase);



                // iv)En az bir tane kucuk harf olsun



               boolean loverCaseb= pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("loverCaseb = " + loverCaseb);




        //v)En az bir tane rakam olsun*/


        boolean  rakam  =  pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("rakam = " + rakam);


        boolean  result  = lengthcontrol&&spaceControl&&upperCase&&loverCaseb&&rakam;

        if (result){
            System.out.println("Şifre Geçerli");

        }else{

            System.out.println("Sifre geçersiz");
        }














    }







}
