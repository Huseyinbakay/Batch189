package day03;

import java.util.Scanner;

public class ScannerTekrar {


    public static void main(String[] args) {

        Scanner input   = new Scanner(System.in);

        System.out.println("Lütfen parolanızı giriniz");


       String pass = input.nextLine();


       boolean karakter = pass.isEmpty();

       boolean  ayniMi= pass.trim().equals(pass);

       boolean  up  =  pass.replaceAll("[^A,Z]","").length()>1;
        boolean low   = pass.replaceAll("[^a-z]","").length()>1;
        boolean digit  =pass.replaceAll("[^0-9]","").length()>1;


        if (karakter){
            System.out.println("Lütren karakter girin");

        }
        else if (!ayniMi){
            System.out.println("Lütrfen space kullanmayın");

             if (up&&low&&digit){
                System.out.println("Parolanız geçerli");

            }else {
                System.out.println("Parolanız yanlış.Lütfen tekrar deneyin");
            }
        }






    }
}

