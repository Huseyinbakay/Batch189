package day20Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {


    public static void main(String[] args) {

        //ilk girenin ilk çıkacagı sistemler

        Queue<String> depo=new LinkedList<>();
        
        depo.add("süt");
        depo.add("et");
        depo.add("peynir");
        depo.add("meyve");
        depo.add("çikolata");

        System.out.println("depo = " + depo);


        depo.remove();//ilk eleman olan sütü sildi

        System.out.println(depo);



        depo.clear();//tamamen siler

        System.out.println(depo);

        System.out.println("depo.poll() = " + depo.poll());   //null verdi

        //System.out.println("depo.element() = " + depo.element());// hata verdi

        System.out.println("depo.peek() = " + depo.peek()); // null verdi


        Queue<String> wareHouse=new PriorityQueue<>() ;

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("water");
        wareHouse.add("orange");
        wareHouse.add("tomate");
        wareHouse.add("apple");
        wareHouse.add("egg");
        System.out.println(wareHouse);

        Deque <String> d=new LinkedList<>();//linklist insertion sırayla ekliyor

        d.add("milk");
        d.add("egg");
        d.add("water");
        d.add("tomate");
        System.out.println("d = " + d);//insertion order


    }

    
    
  
    
    
    
}
