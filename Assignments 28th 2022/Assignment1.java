package April42822;

import java.io.File;

public class Assignment1 {
    public static void main(String[] args) {
        File file = new File("readme.txt");
        if (file.exists())
        {
            System.out.println(file);

        } else
            System.out.println(file.exists());
    }
}
