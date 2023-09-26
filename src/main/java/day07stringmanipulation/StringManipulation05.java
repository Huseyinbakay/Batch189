package day07stringmanipulation;

public class StringManipulation05 {

    public static void main(String[] args) {





 /*  Örnek : Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
           i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
           ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
           iii) Başında ve sonunda boşluk olmamalıdır.
       */



        String    pwd   = "aaabbb";

        // i) Parola Boş olmamalıdır, en az bir karakter icermelidir.


        boolean  first   = pwd.isEmpty();

        System.out.println(first);


        //ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir

            boolean  seconds  =pwd.isBlank();
        System.out.println(seconds);


        //Başında ve sonunda boşluk olmamalıdır.



        boolean third = pwd.trim().equals(pwd);


        if (first){

            System.out.println("Parola boş bırakılamaz");

        }

if (seconds){
    System.out.println("Parolada sadece boşluktan oluşamaz");


    if(!third){
        System.out.println("Parolanın başındav esonunda boşluk yaıpalamaz");

    }
}


    }


}
