import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.Math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j= 0; j < n; j++) {

                int res = 0;
                res += a;

                int resLoop = 0;
                for (int k = 0; k <= j; k++) {
                    double pow = Math.pow(2, k) * b;
                    resLoop += pow;
                    }

                res += resLoop;
                System.out.print(res + " ");
                }
                System.out.println("");

        }
        in.close();
    }
}