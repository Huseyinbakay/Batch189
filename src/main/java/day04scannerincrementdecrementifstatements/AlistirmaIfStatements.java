package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class AlistirmaIfStatements {
    public static void main(String[] args) {

        Scanner girdi  =  new Scanner(System.in);

        System.out.println("Emekli misin");

        boolean emekli  = girdi.nextBoolean();

        if(emekli==true){
            System.out.println("Yalan söyleme");
        }


        if (emekli==false){
            System.out.println("Tesekkürler");}



        Scanner  veri = new Scanner(System.in);

        System.out.println("Dün Kac Dolar Kazandın?");

        short  kazanc1   = veri.nextShort();

        System.out.println("Bugün Kaç Dolar Kazandın");


        short  kazanc2   = veri.nextShort();

        short elemanGider  = 380;

        int toplamNet = kazanc1 + kazanc2-elemanGider;
        System.out.println("toplamNet = " + toplamNet);

        if(toplamNet<0){
            System.out.println("Zarar Etme Kapat");
        }


        if (toplamNet>1&&toplamNet<100){
            System.out.println("Orta hallisin");
        }

        if (100<toplamNet&&toplamNet<500){
            System.out.println("Hadi iyisin");
        }
        if(500<toplamNet){
            System.out.println("Harikasın");
        }


Scanner scan   = new Scanner(System.in);

        System.out.println("Kaç Yıllık Öğretmensiniz");

        byte yil   = scan.nextByte();

        System.out.println("Kademe bilgilerini giriniz");

        byte kademe= scan.nextByte();

        if(yil<5&&kademe>7){
            System.out.println("Maas = 25500");
        }

if (yil>=10&&kademe<6){
    System.out.println("Maaş  = 27500");
}

if (yil>15&&kademe<=3){
    System.out.println("Maaş =30000.Oha Emekli ol artık");
}

Scanner  sayi = new Scanner(System.in);

        System.out.println("Lütfen bir sayı yazınız");

int   kacBasamak   = sayi.nextInt();

        if(0<kacBasamak&&kacBasamak<9){
            System.out.println("Sayı Tek Basamak");
        }
        if(9<kacBasamak&&kacBasamak<99){
        System.out.println("Sayı iki bakamaklı");
        }


        if(99<kacBasamak&&kacBasamak<1000){
        System.out.println("Sayı üç basamaklı");
         }




          }


    }
















