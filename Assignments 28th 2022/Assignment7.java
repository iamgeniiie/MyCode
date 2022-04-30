package April42822;

import java.io.*;
import java.util.Scanner;

public class Assignment7 {
    public static void main(String args[]) {
        try {
            FileInputStream fis = new FileInputStream("readme.txt");
            Scanner sc = new Scanner(fis);

            System.out.println(sc.nextLine());

            System.out.println(sc.nextLine());

            System.out.println(sc.nextLine());

            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
