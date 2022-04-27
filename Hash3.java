package Assingments425;

import java.util.HashSet;

public class Hash3 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Impala");
        cars.add("Challenegr");
        cars.add("Focus");
        cars.add(null);
        cars.add("Gle");
        cars.add("Rolls Royce");
        cars.add(null);
        cars.add("BMW");
        System.out.println(cars);


        System.out.println("Number of Elements: " +cars.size());
    }
}
