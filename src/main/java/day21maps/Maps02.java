package day21maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {



        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ali", 77);
        stdAges.put("Veli", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Can", 58);

        System.out.println(stdAges);

        stdAges.replace("Can",19);//Can ın yaşı değiştirdi replace
        System.out.println(stdAges);

        
        stdAges.replace("Can",19,100);

        System.out.println( stdAges);

        stdAges.putIfAbsent("Ali Can",63);//Bu method Eğer key yoksa ekler bak key yoksa

        System.out.println(stdAges);

        System.out.println(stdAges.get("Ali Can"));//63 verdi çünkü mapte bu key var
        System.out.println(stdAges.get("ali can"));//null verdi çünkü yok


        System.out.println(stdAges.getOrDefault("Ali Can", 0));//63 verdi
        System.out.println(stdAges.getOrDefault("ali can", 0));//0 verdi


        System.out.println(stdAges.containsKey("veli"));//aranan değer var mı yok mu buna bakıyor ama KEY
        System.out.println(stdAges.containsValue(63));//aranan deger var mı yok mu buna bakıyor ama  VALEO

        stdAges.remove("Ali Can");//Bu methot entry i siler.

        System.out.println(stdAges);
             stdAges.remove("Tom", 76);

        System.out.println(stdAges);

    }









}
