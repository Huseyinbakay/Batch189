package Day08loops;

public class ForLoops02 {

    public static void main(String[] args) {


        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz

        String s = "I love java";


        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (s.charAt(i) == 'a') {
                break;

            }
            System.out.print(ch);
        }


        //example 2 :Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A


        String s1 = "Pwd12?Ab";


        for (int i = 0; i < s1.length(); i++) {


            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                continue;
            } else {

                System.out.print(ch);
            }


        }


        String s2 = s1.replaceAll("[a-z]", "");


        System.out.println(s2);


        //ornek 3 Bir String'i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"


        String t = "Java";
        String ters = "";


        for (int i = t.length() - 1; i >= 0; i--) {


            ters = ters + t.charAt(i);


            System.out.println(ters);

        }


    }
}
