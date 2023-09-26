package day12liest;

import java.util.ArrayList;
import java.util.List;

public class day12arraylist {
    public static class day12List {
    }

    public static class ArrayList02 {
        public static void main(String[] args) {



            //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
            //           [J, a, v, a, v] ==> [J, a, v]



            List<Character> a = new ArrayList<>();

            a.add('J');
            a.add('a');
            a.add('v');
            a.add('a');
            a.add('v');

            List<Character> b = new ArrayList<>();//boş arraylist bu


            for (Character w:a) {

                if (!b.contains(w)){

                    b.add(w);

                }
            }

            System.out.println(b);



            //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.
            ArrayList<String> r = new ArrayList<>();
            r.add("Manisa");
            r.add("Nigde");
            r.add("Tokt");
            r.add("Van");
            System.out.println(r);


            ArrayList <String> benimBos=new ArrayList<>();


            for (String w:r) {

                if (w.contains("a")){

                }else {
                    benimBos.add(w);
                }


            }


            System.out.println("beniBos    :"+benimBos);








            for (int i = 0; i <r.size(); i++) {

                if(r.get(i).contains("a")){   //get hangi indexi istersen onu alır getirir.
                    r.remove(i);

                    i--;//bu i inndexi de azaltması içindi


                }

            }




            System.out.println(r);




        }
    }

    public static class ArrayList01 {
        public static void main(String[] args) {



            ArrayList <Integer>  ages =new ArrayList<>();

             //aarraylistere eleman ekleme nasıl olur

            ages.add(5);
            ages.add(7);
            ages.add(19);
            ages.add(1,312);
            ages.add(2,456);
            ages.add(0,1);
            ages.add(6,999);


            ArrayList <Integer>  newages =new ArrayList<>();

            newages.add(8);
            newages.add(89);
            newages.add(100);



            ages.addAll(0,newages);//allindex seçip indexini belirledim.

            System.out.println(ages);
            int elemansayisi=ages.size();//ArrayListlerde length yerine SİZE vAR
            System.out.println(elemansayisi);

            int index =ages.get(4);//Arraylistlerde indexof yok GET var
            System.out.println(index);


            ages.set(1,889);//Arraylistlerde replace yok SET var.İndex gir o indexte kaç olacağını söyle.
            System.out.println(ages);



              //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

            System.out.println();

            ArrayList <Integer>  list =new ArrayList<>();

            list.add(45);
            list.add(25);

            list.add(32);

            list.add(414);

            list.add(4574);

            list.add(85);


            for (Integer w:list) {

                if (w%2!=0){
                    list.set(list.indexOf(w),11);
                }

            }


            System.out.println(list);


        }




        




    }

}
