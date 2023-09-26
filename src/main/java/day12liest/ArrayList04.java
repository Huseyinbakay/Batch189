package day12liest;

import java.util.Arrays;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {


        //Lis oluşturuken kısayol



        List<Integer> yeni= Arrays.asList(1,3,4,5,6,7);

        yeni.set(0,8);
        int sayisi=yeni.size();


        System.out.println(sayisi);
        System.out.println(yeni);





    }
}
