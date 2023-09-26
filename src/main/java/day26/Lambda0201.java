package day26;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda0201 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");








    }


    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.

    public static void printElementsExepctStartwithE(List<String> myList){

        myList.stream().filter(t->!t.startsWith("E")).forEach(t-> System.out.print(t+" "));

    }


    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari tekrarsiz
    // olarak console'a yazdiran method'u olusturunuz.


    public static void printDistingElementsLengthLessFive(List<String> myList){

        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                forEach(t-> System.out.print(t+" "));

    }


    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari buyuk harflerle
    // bir listin icinde veren method'u olusturunuz.




    public static List<String> getElementLengthMoreThanFiveUpperCase(List<String> myList){

       return myList.stream().filter(t->t.length()>5).map(String::toUpperCase).collect(Collectors.toList());

    }

    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.



    public static void getElementLengthMorelessFiveLowerCase(List<String> myList){

        List<String> newList=myList.
                stream().
                distinct().
                filter(t->t.length()<5).sorted().
                map(String::toLowerCase).
                collect(Collectors.toList());

        System.out.println(newList);
    }

    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.


    public static void printNaturelOrderDistingtoUpperCase(List<String> myList){
        myList.
                stream().
                distinct().
                sorted().map(String::toUpperCase).
                forEach(t-> System.out.println(t+" "));



    }

public static void printElementUniqeLowerCaseSortedWithLength(List<String> myList){

        myList.
                stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.println());

}



}
