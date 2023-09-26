package day05ifelseswitchternary;

import java.util.Locale;
import java.util.Scanner;

public class IfStatementsExercise02 {
    public static void main(String[] args) {

        Scanner   input   = new Scanner(System.in);

        System.out.println("Where want to stay in (Campsite,Hostel,Hotel or Villa)");

        String place   = input.next();
        if (place!="Campsite" || place!="Hostel" || place!="Hotel" || place!= "Villa"){
            System.out.println("Error");

        }





        System.out.println("How many days do you want to stay");

        byte day  = input.nextByte();

        System.out.println("How many people will stay");
        byte    people   = input.nextByte();


        short  campsitePrice  = 15;
        short  hostelPrice    = 125;
        short  hotelPrise  =    250;
        short  villaPrice  =    750;

        switch (place.toLowerCase(Locale.ROOT)){
            case"camsite" :
                System.out.println(campsitePrice*day*people);
                break;


            case "hostel":
                System.out.println(hostelPrice*day*people);
                  break;


            case "hotel":
                System.out.println(hotelPrise*day*people);
                break;


            case "villa":
                System.out.println(villaPrice*day);
                break;

            default:
                System.out.println("your data is wrong ");

        }











    }
}
