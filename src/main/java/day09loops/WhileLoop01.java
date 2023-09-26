package day09loops;

public class WhileLoop01 {

    public static void main(String[] args) {


        //3 den 6 ya kadar olan sayıları yazdır


        int i = 3;
        while (i < 7) {

            System.out.println(i);
            i++;


        }

        //23 den


        int k = 23;
        while (k > 11) {


            if (k % 2 == 0) {

                System.out.println(k);

                k++;
            }


        }


    }
}