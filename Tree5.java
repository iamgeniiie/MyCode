package Assingments425;

import java.util.TreeSet;

public class Tree5 {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
        cars.add("Impala");
        cars.add("Challenger");
        cars.add("Focus");
        cars.add("Gle");
        cars.add("Rolls Royce");
        cars.add("BMW");


        for (String name: cars) {
            System.out.println(name);
        }

        System.out.println("Highest:" + cars.pollLast());
        System.out.println("Lowest:" + cars.pollFirst());
    }
}
