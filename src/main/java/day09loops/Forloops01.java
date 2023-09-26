package day09loops;

import java.util.Scanner;

public class Forloops01 {
    public static void main(String[] args) {




         /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....
    */


        for (int i = 1; i < 5; i++) {


            System.out.println("week = " + i);


            for (int k = 1; k < 8; k++) {

                System.out.println("day = " + k);


            }


        }







 /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */


        for (int i = 1; i <=3 ; i++) {

            System.out.println("x x x x x ");

            for (int k = 1; k <=5; k++) {

                System.out.print("X ");
            }
            System.out.println();
        }


        Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısını girin");

        int satir= input.nextInt();
        System.out.println();


    }

    }











