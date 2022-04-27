package Assingments425;


import java.util.HashSet;

public class Hash4 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Impala");
        cars.add("Challenger");
        cars.add("Focus");
        cars.add(null);
        cars.add("Gle");
        cars.add("Rolls Royce");
        cars.add(null);
        cars.add("BMW");
        System.out.println(cars);


        cars.clear();
        System.out.println("Is Hash Set empty?" + cars.isEmpty());


    }
}
