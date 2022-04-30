package April42822;

import java.io.File;


public class Assignment3 {
    public static void main(String[] args) {
        File file = new File("readme.txt");
        if (file.exists())
        {
            System.out.println("This file exists");

        } else
            System.out.println("This file doesn't exist");
    }
}
