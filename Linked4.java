package Assingments425;

import java.util.Iterator;
import java.util.LinkedList;


public class Linked4 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
            cars.add("Impala");
            cars.add("Challenger");
            cars.add("Focus");
            cars.add("Gle");
            System.out.println(cars);


            Iterator iterator = cars.descendingIterator();
            while (iterator.hasNext()) {
                System.out.print(" " + iterator.next());
            }
    }
}
