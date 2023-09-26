package day20Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {


    public static void main(String[] args) {


        //Setler benzersiz elemanları depolamak için kullanılır

        //3 tame set var


           /*
        1)Arraylistler eleman silme ve eleman eklemede basarisizdirlar
          O yüzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
        2)Linkedlistler index kullanmadiklarindan eleman ekleme ve silmede re-index yapilmasina gerek yoktur
        Buda linkdelistleri eleman ekleme ve silmede cok basarili hale getirir
        3) Arraylistlerde search islemi kolay yapilir, cunku indexler adres gibidir
        4) Linkedlistlerde search islemi zor yapilir cunku linkedlistler index kullanmazlar
        index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir buda cok fazla is demektir*/



        HashSet<String> hs=new HashSet<>();

        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");

        System.out.println(hs);

        hs.add(null);
        System.out.println(hs);




        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();

        lhs.add(3);
        lhs.add(17);
        lhs.add(1244);
        lhs.add(456);
        lhs.add(21);
        lhs.add(null);
        System.out.println(lhs);

        LinkedHashSet<Integer> lhsmjl=new LinkedHashSet<>();

        lhs.add(8);
        lhs.add(17);
        lhs.add(124);
        lhs.add(46);
        lhs.add(2);
        lhs.add(null);
        System.out.println(lhs);

        lhs.retainAll(lhsmjl);///////iki LinkHash in kesişim elemanlarını


        TreeSet<Character>tset=new TreeSet<>();


        tset.add('A');
        tset.add('C');
        tset.add('K');
        tset.add('T');
        tset.add('L');
        tset.add('Z');
        tset.add('P');

        System.out.println(tset);//Alfabetik siralar ve null koyamazsın farkı da bu diğer setlerden.

        System.out.println("tset.subSet('G','T') = " + tset.subSet('G', 'T'));


    }
}
