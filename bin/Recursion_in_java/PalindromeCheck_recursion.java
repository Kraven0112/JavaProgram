package Recursion_in_java;

import java.util.Scanner;

public class PalindromeCheck_recursion {
    public static boolean checkPalindrome(String string,int start,int end){
        if(string.charAt(start) != string.charAt(end)){
            return false;
        }
        if(start == end || end == start ){
            return true;
        }
        start++;
        end--;
        checkPalindrome(string, start, end);
        return true;
    }
    public static void main(String[]args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String myString = mc.nextLine();
        int start = 0;
        int end = myString.length()-1;
        boolean ans = checkPalindrome(myString, start, end);
        System.out.println(myString + " is a palindrome string : "+ans);

        mc.close();
    }
}
