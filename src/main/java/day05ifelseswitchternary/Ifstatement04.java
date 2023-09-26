package day05ifelseswitchternary;

import java.util.Scanner;

public class Ifstatement04 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen bir gün ismi giriniz");

        String dayName = input.next();





boolean isWeekDay = dayName.equalsIgnoreCase("Monday") ||
        dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("Wednesday") ||
        dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday");

    boolean isWeekendDay =    dayName.equalsIgnoreCase("Saturday") ||
            dayName.equalsIgnoreCase("Sunday");


    if (isWeekDay){

        System.out.println("Week Day.Lets go to work");
    }

    if (isWeekendDay){
        System.out.println("You dont go to work");
    }

    else {
        System.out.println("You write is wrong");
    }

    }
    }
