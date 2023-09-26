package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatement01 {


    public static void main(String[] args) {

        Scanner input   =new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        int  sayi  = input.nextInt();

        if(sayi>0){
            System.out.println("Pozitif");

        }else if(sayi<0){

            System.out.println("Negatif");
        }else{

            System.out.println("Nötr");
        }



















    }


}



