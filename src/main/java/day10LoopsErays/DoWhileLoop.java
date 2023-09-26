package day10LoopsErays;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {



 /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 2 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */


        Scanner input =new Scanner(System.in);





        int counter =0;

        do {
            if(counter==2){
               //counter başta 0 bak.en altta da counter++.Yani if ile counter 2 olursa if çalışacak ve hesap bloke diyecek.
                System.out.println("Hesabınız bloke oldu");

                break;//break yaparak sifre ve admin dogru ise tekrar tekrar sormasın diye break yaptık.
            }


            System.out.println("Lütfen kullanıcı isminizi giriniz");

            String username   =input.next();
            System.out.println("Lütfen sifrenizi giriniz");
            String pwd    = input.next();


            if (username.equals("admin")&&pwd.equals("pwd123")){

                System.out.println("Hesanınıza hoşgeldiniz");
                break;

            }

            counter++;



        }while (true);
              //true yaparak sonsuz döngü yaptık.












    }




}
