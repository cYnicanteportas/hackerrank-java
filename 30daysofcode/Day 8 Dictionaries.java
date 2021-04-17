//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> Phonebook;
        Phonebook = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            Phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (Phonebook.containsKey(s)){
                System.out.println(s + "=" + Phonebook.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}