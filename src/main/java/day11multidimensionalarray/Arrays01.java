package day11multidimensionalarray;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

//Example 1: [] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]





        int sayac=0;

        int ilk [] ={0, 2, 3, 0, 12, 0};

        int son []=new int[ilk.length];

        for (int w:ilk) {

            if (w!=0){
                son[sayac]=w;

              sayac++;
            }
            System.out.println(Arrays.toString(son));
        }

        //Öncelikle bana  verilen array elemanı kadar array oluşturdum.Ama içi tüm 0 olan "son" arrayi olusturduk.
        //o zaman bu karakterlerin içinde gezeceksem eğer for each kullanmak mantıklı.

        //for each açtım ve elemanları tek tek gezmeye başladım.
        //for içine de if actım çünku 0 ise koda bunu almayacagım.
        // Bu w tek tek eline rakamları eline alır ve if olduğu için 0 a eşit mi diye baktı.

        //son[] a bir index olması gerek ki adam ona göre yerleştirsin onu.E sayaç yok.Sıkıntı yok kendime yukarıda bir
        //açtık ve loop da sayacı hep 1 artırdık ona gore de döngüde yerlerine yerleştirdi.











    }




}
