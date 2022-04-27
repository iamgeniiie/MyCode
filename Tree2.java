package Assingments425;

import java.util.Iterator;
import java.util.TreeSet;


public class Tree2 {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
        cars.add("Impala");
        cars.add("Challenger");
        cars.add("Focus");
        cars.add("Gle");
        cars.add("Rolls Royce");


        for (String name : cars) {
            System.out.println(name);
        }

        Iterator value = cars.iterator();

        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
