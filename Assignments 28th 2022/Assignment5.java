package April42822;

import java.io.*;

public class Assignment5 {
    public static void main(String args[]) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a message. Enter 'exit' to exit");

        do {
            str = br.readLine();
            System.out.println(str);
        }
        while(!str.equals("exit"));
    }

}
