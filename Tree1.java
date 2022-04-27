package Assingments425;

import java.util.TreeSet;

public class Tree1 {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
        cars.add("Impala");
        cars.add("Challenger");
        cars.add("Focus");
        cars.add("Gle");
        cars.add("Rolls Royce");


        for(String name: cars) {
            System.out.println(name);
        }
    }

}
