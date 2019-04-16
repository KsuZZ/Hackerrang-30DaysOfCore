import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int ii = scan.nextInt();
        double dd = scan.nextDouble();
        String ss = scan.nextLine(); String sss = scan.nextLine();

        i = i + ii;
        System.out.println(i);
        d = d + dd;
        System.out.println(d);		
        String str = s + sss;
        System.out.println(str);

        scan.close();
    }
}
