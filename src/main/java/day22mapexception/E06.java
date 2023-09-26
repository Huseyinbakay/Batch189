package day22mapexception;

public class E06 {
    public static void main(String[] args) {

       String s="Java";
       String s1="Ali VEli Can";

        getNumCh(s);
        getNumCh("");
        getNumCh(s1);
        String u=null;


    }

    public static void getNumCh(String s){

        int numOf=s.length();
        System.out.println("numOf = " + numOf);



    }
}
