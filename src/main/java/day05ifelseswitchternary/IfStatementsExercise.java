package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatementsExercise {
    public static void main(String[] args) {
        Scanner  input    = new Scanner(System.in);

        System.out.println("Lütfen çalışma şeklinizi girin(parttime or fulltime");

        String work  =input.next();

        System.out.println("Lütfen çalışma gün sayınızı giriniz");

        byte workDay  =input.nextByte();



        short  ucretFull  = 400;
        short  ucretPart = 250;


        if (work.equalsIgnoreCase("parttime")){
            System.out.println(ucretPart*workDay);
        }else if (work.equalsIgnoreCase("fullTİme")) {

            System.out.println(ucretFull*workDay);



        }else {
            System.out.println("Elini ayarına senin.Yukarıda dedim ki parttime or fulltime gir");
        }


    }
}


