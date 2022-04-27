package Assingments425;

import java.util.LinkedList;

public class Linked1 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Impala");
        cars.add("Challenger");
        cars.add("Focus");
        System.out.println(cars);


        cars.addLast("Gle");
        System.out.println(cars);
    }

}
