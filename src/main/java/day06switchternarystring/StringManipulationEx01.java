package day06switchternarystring;

import java.util.Scanner;

public class StringManipulationEx01 {



    public static void main(String[] args) {



        String  aLotOfWord   =  "Yahya Abi bazen söylediklerimi unutuyor.Ben 999 defa hatırlatmak zorunda kalıyorum";


        int charakter01  = aLotOfWord.length();
        System.out.println(charakter01);


        char  middleChar = aLotOfWord.charAt(42);
        System.out.println(middleChar);



        String replace1 = aLotOfWord.replace("999","12345");
        System.out.println(replace1);


        boolean varMi   = aLotOfWord.contains("Yahya");
        System.out.println(varMi);

        String  sub12= aLotOfWord.substring(40,42);
        System.out.println(sub12);



        boolean   tTrueFalse   = aLotOfWord.contains("999");
        System.out.println(tTrueFalse);

        char karakter  = aLotOfWord.charAt(75);
        System.out.println(karakter);

        int   sayiKarakter   = aLotOfWord.length();
        System.out.println(sayiKarakter);



        String aralikKarakter   = aLotOfWord.substring(81);
        System.out.println(aralikKarakter);

        int   legent22  = aLotOfWord.length();
        System.out.println(legent22);

        char sonKarakter2 = aLotOfWord.charAt(sayiKarakter-1);
        System.out.println(sonKarakter2);


        String ssssString    =   aLotOfWord.substring(1,8);
        System.out.println(ssssString);


        boolean varMIki   = aLotOfWord.contains("Abi");
        System.out.println(varMIki);




        String change  = aLotOfWord.replace("Yahya","Ahmet");

        System.out.println(change);




        Scanner   input   =new Scanner(System.in);

        System.out.println("Lütfen bir sayı yazınız");

        int  veriSayi13  =    input.nextInt();


       if (veriSayi13<10&&veriSayi13>0) {
           System.out.println("sayı tek basamak");


       }else if (veriSayi13>9&&veriSayi13<99);
        System.out.println();

       }


























    }





