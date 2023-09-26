package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatements05 {
    public static void main(String[] args) {


        Scanner  input   = new Scanner(System.in);

        System.out.println("Lütfen Cinsiyet giriniz");

        String  cinsiyet  = input.next();

        System.out.println("Lütfen Yaşınızı girin");

        int   age   =   input.nextInt();

        if (age<0||age>120) {
            System.out.println("Lütfen 0 ile 120 arasında bir sayı giriniz");
        }


        else if(cinsiyet.equalsIgnoreCase("Kadın")){

            if (age>60) {
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("Emekli olamaz");
            }
        } else if (cinsiyet.equalsIgnoreCase("Erkek")) {

            if (age>65){
                System.out.println("Emekli olabilir");

            }else {
                System.out.println("Emekli olamaz");
            }

            }else System.out.println("Wrong DAta");


        }



    }

