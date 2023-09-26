package day24;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {


    public static void main(String[] args) {

        Cities hatay = Cities.HATAY;

        System.out.println(hatay);

        String ciytnam = Cities.ADANA.getCityName();

        String postCode = Cities.ANKARA.getPostCode();
        System.out.println(postCode);

        System.out.println(Cities.İSTANBUL.getPlakaCode());


        ////Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir plaka kodu giriniz");
        int plala = input.nextInt();

        Cities[] cities = Cities.values();


        if (plala>82||plala<=0){

            System.out.println("Plaka gecersiz");

        }else {
            for (Cities w:cities) {

                if (plala==w.getPlakaCode()){

                    System.out.println("Girmiş olduğunuz plaka codu   "+w.getCityName() +"dir");
                    break;



                }else System.out.println();
        }




        }


    }

    }

