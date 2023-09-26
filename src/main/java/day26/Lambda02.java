package day26;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");


        //1) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.

      removeIfLengtGreaterThanFive(myList);//[Ali, Elif, Yusuf, Elif]



        //2 ) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.




    }

    public static void removeIfLengtGreaterThanFive( List<String> myList){

        myList.removeIf(t->t.length()>5);

        System.out.println(myList);

    }


  public static void removeIfElementsStartWithZorEndsWith(List<String> myList){
        myList.removeIf(t->t.startsWith("Z")||t.endsWith("f"));


      System.out.println(myList);

  }


  public static void removeIfElementsContains(List<String> myList){//X varsa sil

        myList.removeIf(t->t.contains("x"));


  }





}
