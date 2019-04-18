import java.io.*;
import java.util.*;

public class Solution {
    public static void division(String str, int a){
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            System.out.print(c);
            i++;
        }
        System.out.print(" ");
        for (int i = 1; i < str.length(); i++){
            char c = str.charAt(i);
            System.out.print(c);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        String str;
        str = in.nextLine();
        String str1;
        for (int i=0; i < a; i++){
        str1 = in.nextLine();
        division(str1, a);
        System.out.println();
        }
    }
}

