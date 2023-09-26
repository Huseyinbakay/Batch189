package day14constructorsdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {


        LocalTime sindikiZaman=LocalTime.now();
        System.out.println(sindikiZaman);

      DateTimeFormatter dtf1=  DateTimeFormatter.ofPattern("HH : mm");

        String fortmat=dtf1.format(sindikiZaman);
        System.out.println("fortmat = " + fortmat);
              /*
DateTime Class ta kullanilan tarih saat formatlari
     ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a ==> 12'li saat sistemi AM, PM
    HH : mm : ss==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */


//date formatı


        LocalDate myCurrent=LocalDate.now();


        DateTimeFormatter dtf2  =DateTimeFormatter.ofPattern("MMMM/dd/yyyy");


        String formatMyCurrent=dtf2.format(myCurrent);

        System.out.println("formatMyCurrent = " + formatMyCurrent);//Agustos 28 2023 şeklinde verdi


        //


        LocalDate myCurrent12222=LocalDate.now();



        DateTimeFormatter dtf3  =DateTimeFormatter.ofPattern("dd**MMM**yyyy");


        String formatMyCurrent111=dtf3.format(myCurrent12222);

        System.out.println("formatMyCurrent111 = " + formatMyCurrent111);

        
        //İLERİKİ ZAMANI ALMA
        
        
        //tokyoda ayın kaçı
       //LocalDate tokyo11= LocalDate.now(ZoneId.of("Asiaa/Tokyo"));


       // System.out.println(tokyo11);
        LocalDateTime tarihZman=LocalDateTime.now();

        System.out.println(tarihZman);


        DateTimeFormatter dtfrmtr=DateTimeFormatter.ofPattern("dd*MMM*yyy-hh:mm");


        String yeniZaman=dtfrmtr.format(tarihZman);

        System.out.println("yeniZaman = " + yeniZaman);
    }




}
