package Assingments425;

import java.util.HashSet;


public class Hash1 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Impala");
        cars.add("Challenger");
        cars.add("Focus");
        cars.add("Gle");
        cars.add(null);
        cars.add("Rolls Royce");
        cars.add(null);
        System.out.println(cars);


        cars.add("BMW");
        System.out.println(cars);


    }
}
