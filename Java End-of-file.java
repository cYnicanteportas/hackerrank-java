import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int count = 0;
        while(scan.hasNextLine()){
            count+= 1;
            System.out.print(count + " ");
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
}