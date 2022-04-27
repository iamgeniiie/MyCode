package Assingments425;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked3 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList();
        cars.add("Impala");
        cars.add("Challenger");
        cars.add("Focus");
        cars.add("Gle");
        cars.add("Rolls Royce");
        System.out.println(cars);



        Iterator i = cars.listIterator(2);


        while (i.hasNext()) {
            System.out.println(i.next());

        }
    }

}
