package day25Lambda;

import day26.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));



    }

    //1) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Structured)



public static void printEvenElements1(List<Integer> nums){

    for (Integer w:nums) {

        if (w%2==0){
            System.out.println(w+" ");
        }
    }


}






    public static void printEvenElements2(List<Integer> nums){

        nums.
                stream().
                filter(t->t%2==0).
                forEach(Utils::printInTheSameLineWithSpace);
    }


    //2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina
    // bosluk koyarak yazdiran method'u olusturunuz.(Functional)
//2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina
    // bosluk koyarak yazdiran method'u olusturunuz.(Functional)


public static void printSquareOddElements(List<Integer> nums){

        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(Utils::printInTheSameLineWithSpace);


}
    //3) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina
    // bosluk koyarak yazdiran method'u olusturunuz.(Functional)

public static void printCubeDistingOddElements(List<Integer> nums){

        nums.stream().
                distinct().
                filter(t->t%2==1).
                map(t->t*t*t).
                forEach(Utils::printInTheSameLineWithSpace);


}

public static void doubLe(List<Integer> nums){

      int sum=nums.
              stream().
              distinct().
              filter(t->t%2==0).
              map(t->t*t).
              reduce(0,(t,u)->t+u);

              System.out.println(sum);

}
  public  static void squarePlus(List<Integer> nums){

        int sum=nums.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(1,(t,u)->t*u);

       System.out.println(sum);
  }


    //6)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

  public static void getMaxValeu1(List<Integer> nums){

       int max= nums.
               stream().
               distinct().
               reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
      System.out.println(max);

  }


    public static void getMinValeu1(List<Integer> nums){

       Integer min= nums.
               stream().distinct().
               reduce(Math::min).
               get();


        System.out.println(min);
    }



    public static void getMinValeu2(List<Integer> nums){

       Integer min= nums.
               stream().
               distinct().
               reduce((t,u)->Math.min(t,u)).
               get();

    }


    //7)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun

    public static void getMinGreaterSevenEven(List<Integer> nums){

       Integer min= nums.
               stream().
               filter(t->t>7 && t%2==0).
               sorted().findFirst().
               get();
        System.out.println(min);

    }



}
