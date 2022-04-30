package April42822;

import java.io.File;

public class Assignment4 {
    public static void main(String[] args) {
        File file = new File("readme.txt");
        if (file.exists())
        {
            System.out.println("This path is a file by the name" + file);

        } else
            System.out.println("This path is a directory");
    }
}
