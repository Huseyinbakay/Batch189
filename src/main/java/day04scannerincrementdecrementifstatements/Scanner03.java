package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner03 {


    public static void main(String[] args) {



/*package day04scannerincrementdecrementifstatements;

        public class Scanner03 {
            public static void main(String[] args) {

                //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
                //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
                //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar*/

          Scanner     input   = new Scanner(System.in);

        System.out.println("Dikdörtgenin Kısa kenarını giriniz.");

       float   kisaKenar  = input.nextFloat();

        System.out.println("Dikdörtgenin Uzun Kenarını Girin");

        float  uzunKenar  =input.nextFloat();

        System.out.println("Alan = " + uzunKenar*kisaKenar);
        System.out.println("Çevre = " + (uzunKenar+kisaKenar)*2);



















    }
}



