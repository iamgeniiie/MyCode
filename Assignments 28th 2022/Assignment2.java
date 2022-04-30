package April42822;

import java.io.File;

public class Assignment2 {
    public static void main(String[] args) {
        File dir = new File("src");
        dir.mkdir();
        File file = new File("src", "readme.txt");
        if (dir.exists()) {
            System.out.println(file);

        } else
            System.out.println(dir.exists());
    }
}
