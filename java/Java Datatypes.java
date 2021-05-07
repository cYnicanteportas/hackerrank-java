import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        byte    byteMin    =    -128;
        byte    byteMax    =    127;
        short   shortMin   =    -32768;
        short   shortMax   =    32767;
        int     intMin     =    -2147483648;
        int     intMax     =    2147483647;
        long    longMin    =    -9223372036854775808L;
        long    longMax    =    9223372036854775807L;
        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=byteMin && x<=byteMax){
                    System.out.println("* byte");
                }
                //Complete the code
                if(x>= shortMin && x<= shortMax){
                    System.out.println("* short");
                }
                if(x>= intMin  && x<= intMax) {
                    System.out.println("* int");
                }
                if(x>= longMin && x<= longMax){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}


