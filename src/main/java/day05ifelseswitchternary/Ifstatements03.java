package day05ifelseswitchternary;

import java.util.Scanner;

public class Ifstatements03
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yaş giriniz");

        int yas = input.nextInt();


        if (yas < 5) {
            System.out.println("Bebek");

        } else if (yas < 13) {
            System.out.println("Cocuk");


        }else if (yas<21)     {
            System.out.println("Yetişkin");
        } else if (yas>31) {
            System.out.println("Tanımlanmamıs");

        }


    }




}
