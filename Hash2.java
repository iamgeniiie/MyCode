package Assingments425;

import java.util.HashSet;
import java.util.Iterator;

public class Hash2 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Impala");
        cars.add("Challenger");
        cars.add("Focus");
        cars.add(null);
        cars.add("Gle");
        cars.add(null);
        cars.add("Rolls Royce");
        System.out.println(cars);

        
        Iterator iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        
    }
}
