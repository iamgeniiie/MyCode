package Assingments425;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tree4 {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<String>();

        cars.add("Impala");
        cars.add("Challenger");
        cars.add("Focus");
        cars.add("Gle");
        cars.add("Rolls Royce");
        cars.add("BMW");

        System.out.println("TreeSet contains: " + cars);

        Set<String> reverseSet = cars.descendingSet();

        Iterator<String> itr = reverseSet.iterator();

        System.out.println("Reverse set contains: ");
        while (itr.hasNext()) {
            System.out.println( itr.next());
        }
    }
}
