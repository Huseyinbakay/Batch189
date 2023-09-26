package day22mapexception;

public class E04 {
    public static void main(String[] args) {

        String arr []={"j","a","v","a"};

      getArr(arr,7);

    }



    public static void getArr(String [] s,int a){


        try {
            String el=s[a];
        } catch (Exception e) {
            System.err.println("Olmayan index girdin"+e.getMessage()+e.getCause());

            e.printStackTrace();

            System.out.println("Olmayan index girdin\"+e.getMessage()+e.getCause()");
        }
    }
}
