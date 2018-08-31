import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static Scanner scanner = new Scanner(System.in);
    public static int B = scanner.nextInt();
    public static int H = scanner.nextInt();
    public static boolean flag;

static {
    flag = true;
    if(B<=0 || H<=0){
        System.out.print("java.lang.Exception: Breadth and height must be positive");
        flag = false;
    }   
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

