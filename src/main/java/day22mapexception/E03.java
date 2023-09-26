package day22mapexception;

public class E03 {
    public static void main(String[] args) {

        String s="Java";
        getChar(s,4);



    }

    public static void getChar(String s ,int idx ){

        try {
            char ch=s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            System.err.println("Yanlissss.Olmayan idx girildi"+e.getMessage());

            System.out.println("e.getCause() = " + e.getCause());
            e.printStackTrace();
            System.err.println("Catc blok içi");
        }


    }



}
