package Assingments425;


import java.util.TreeSet;

public class Tree3 {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
        cars.add("Impala");
        cars.add("Challenger");
        cars.add("Focus");
        cars.add("Gle");
        cars.add("Rolls Royce");
        System.out.println("TreeSet Cars contains:" + cars);

        TreeSet<String> bikes = new TreeSet<>();
        bikes.add("Kawasaki");
        bikes.add("Harley");
        System.out.println("TreeSet Bikes contains:" + bikes);

        System.out.println("The MergedSet contains:" + cars + bikes);

    }
}
