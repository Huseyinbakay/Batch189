package day26;

import java.util.ArrayList;
import java.util.List;

public class CourseRunner {


    public static void main(String[] args) {


        Course courseTurk1=new Course("summer1","Tukish Day1",96,88);

        Course courseTurk2=new Course("summer2","Tukish Day2",95,87);

        Course courseTurk3=new Course("summer3","Tukish Day3",94,86);

        Course courseTurk4=new Course("summer4","Tukish Day4",93,85);


        List<Course> corses=new ArrayList<>();



        corses.add(courseTurk1);
        corses.add(courseTurk2);
        corses.add(courseTurk3);
        corses.add(courseTurk4);

        //1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol kodu yaziniz


       boolean result1= corses.stream().allMatch(t->t.getAvarageScore()>92);

        System.out.println(result1);



        //2)Tum kurslardaki ögrenci sayilarinin larin 100 den buyuk olup olmadigini kontrol kodu yaziniz


        boolean result2=corses.stream().allMatch(t->t.getNumberOffStudent()>100);
        System.out.println(result2);




        //3)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz.


        boolean result3=corses.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result3);




        boolean result4=corses.stream().anyMatch(t->t.getSeason().contains("summer1"));

        System.out.println(result4);



       boolean result5= corses.stream().noneMatch(t->t.getSeason().contains("Fall"));



       boolean result6=corses.stream().noneMatch(t->t.getCourseName().contains("German"));

    }




}
