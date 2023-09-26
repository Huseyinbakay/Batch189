package day06switchternarystring;

import java.util.Scanner;

public class Switch01 {


    public static void main(String[] args) {


        Scanner  input  =  new Scanner(System.in) ;

        System.out.println("Lütfen başlangıç ayının kacıncı ay olduğunu girin");


        int    numOfMonth   = input.nextInt();




        switch (numOfMonth){
            case 1 :
                System.out.println("January");

            case 2 :
                System.out.println("February");

            case 3 :
                System.out.println("Marc");

            case 4 :
                System.out.println("April");


            case 5 :
                System.out.println("January");


            case 6 :
                System.out.println("");


            case 7 :
                System.out.println("");

            case 8 :
                System.out.println("");

            case 9 :
                System.out.println("May");


            case 10 :
                System.out.println("June");


            case 11 :
                System.out.println("");


            case 12 :
                System.out.println("January");
                break;

            default:
                System.out.println("Lütfen gecerli ay giriniz");


        }
    }
}

