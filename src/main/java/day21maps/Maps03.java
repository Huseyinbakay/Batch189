package day21maps;

import java.lang.reflect.Array;
import java.util.*;

public class Maps03 {

    public static void main(String[] args) {

        /*

          //key tekrarli kullandigimizda hata vermez, en son verilen entry nin degerini kabul eder
        stdAges.put("Can", 18);
        System.out.println(stdAges);

        //replace() methodu value lari keyleri kullanarak update etmeye yarar
        stdAges.replace("Can",19);
        System.out.println(stdAges);

        //replace("Can",19,41); methodu map icinde key olarak Can var ise ve value su 19 ise 41 e donusturur yoksa donusturmez
        stdAges.replace("Can",19,41);
        System.out.println(stdAges);

        //putIfAbsent("AliCan",63); methodu mapte AliCan key olarak yoksa ekler varsa eklemez
        stdAges.putIfAbsent("AliCan",63);
        System.out.println(stdAges);

        //get methodu aranan key eger mapte var ise value u verir, yok ise null verir
        System.out.println(stdAges.get("AliCan"));//63
        System.out.println(stdAges.get("Alican"));//null

        //getOrDefault() methodu aranan key eger mapte var ise valu u verir yok ise istedigimiz degeri verir
        System.out.println(stdAges.getOrDefault("AliCan", 0));//63
        System.out.println(stdAges.getOrDefault("Alican", 0));//0

        //containsValue() methodu value larin icinde aranan bir degerin olup olmadigni kontrol eder
        System.out.println(stdAges.containsValue(63));
        System.out.println(stdAges.containsValue(163));

        //containsKey() methodu key lerin icinde aranan bir degerin olup olmadigni kontrol eder
        System.out.println(stdAges.containsKey("AliCan"));
        System.out.println(stdAges.containsKey("AliCaN"));

        //remove() methodu key kullanarak entry silmeye yarar
        stdAges.remove("AliCan");
        System.out.println(stdAges);

        //remove("Tom",76); methodu hem key hemde value yu kontrol eder eslesirse siler eslesmez ise silmez
        stdAges.remove("Tom",76);
        System.out.println(stdAges);


        */


        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        String s="I like you, like like!";

        s=s.replaceAll("\\p{Punct}","");
        System.out.println(s);

        String [] word=s.split(" ");

        System.out.println(Arrays.toString(word));

        HashMap<String,Integer>occ=new HashMap<>();

        for (String w:word) {

            Integer numOfoccurance=occ.get(w);

            if (numOfoccurance==null){

               occ.put(w,1) ;

            }else {

                occ.replace(w,numOfoccurance+1);
            }

        }


        System.out.println(occ);


        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
//"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1


        String henry="Hello Henry!";
        henry.replaceAll("\\p{Punct}","");
        List<Character>hello=new ArrayList<>();

        for (int i = 0; i <henry.lastIndexOf("y") ; i++) {

            hello.add(henry.charAt(i));

        }








        Hashtable<String,Integer>ogrenciNot=new Hashtable<>();

        ogrenciNot.put("Ali", 77);
        ogrenciNot.put("Veli", 38);
        ogrenciNot.put("Tom", 76);
        ogrenciNot.put("Brad", 58);
        ogrenciNot.put("Can", 58);
      //  ogrenciNot.put(null,75) Keyler null olamaz

        //ogrenciNot.put("ahmet",null);valeo da da null olmadı


        //Ne zaman coklu işe ihtiyacın varsa HashTable kullan.HashMapp bu çoklu iş için uygun değil.
        //null kullanmayacaksan bunu kullan


        TreeMap<String,Integer>ulkeNufus=new TreeMap<>();

        ulkeNufus.put("Germany",85000000);//Her satıra entry deniyor
        ulkeNufus.put("Italy",40000000);
        ulkeNufus.put("USA",400000000);
        ulkeNufus.put("Turkey",85000000);

        //TreeMap  ler key adına göre ekleme yapar.
        //key e null giremezsin ama valeo ya null koyabiliyorsun.
        //HashMapp e key lere tek null ama valeo da istediğin kadar null koy.




    }

}
