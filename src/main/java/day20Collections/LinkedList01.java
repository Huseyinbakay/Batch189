package day20Collections;

import java.util.LinkedList;

public class LinkedList01 {
    
     /*
        1)Arraylistler eleman silme ve eleman eklemede basarisizdirlar
          O yüzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
        2)Linkedlistler index kullanmadiklarindan eleman ekleme ve silmede re-index yapilmasina gerek yoktur
        Buda linkdelistleri eleman ekleme ve silmede cok basarili hale getirir
        3) Arraylistlerde search islemi kolay yapilir, cunku indexler adres gibidir
        4) Linkedlistlerde search islemi zor yapilir cunku linkedlistler index kullanmazlar
        index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir buda cok fazla is demektir
         */


    public static void main(String[] args) {
        
        
        LinkedList<String>list=new LinkedList<>();

        list.add("Mehmet");
        list.add("Ahmet");
        list.add("Onur");
        list.add("Kübra");
        list.add("Tugba");
        list.add("Duygu");
        list.add("Mehmet");

        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);

        list.add(1,"Zafer");
        System.out.println("list = " + list);

        System.out.println("list.size() = " + list.size());


        list.addFirst("Onur");

        list.addLast("İbrahim");

        System.out.println(list);

       // list.remove("Mehmet");
        System.out.println(list);

        list.removeFirstOccurrence("Mehmet");
        System.out.println(list);



        String str=list.peek();//  ilk nodu silmeden bize getirir

        System.out.println(str);

        list.poll();  //ilk elemanı aldı getirdi ama listeden o elemanı çıkardı
        System.out.println(list);


        //peek ile eelment methodu ikisi de ilk elemanı silmeden getirir.
        //peek list boş ise bize null verir.Element ise bu noktada hata verir

        System.out.println("list.element() = " + list.element());
        System.out.println(list);

        //poll ile pop aynı sekilde ilk elemanı bize kesip getirir yani listeden çıkarıp getirir.
        //Farkı ise poll liste boş ise null pop ise bu durumda hata verir.



        System.out.println("list.pop() = " + list.pop());
        System.out.println(list);


    }
    
    



  











}
