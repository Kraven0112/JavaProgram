package Recursion_in_java;

public class Odd_recursion {
    public static void printOddNum(int i,int num,int odd){
        if(i>num){
            return;
        }
        if(i%2!=0){
            odd = i;
            System.out.println(odd);
        }
        printOddNum(i+1, num, odd);
    }
    public static void main(String[]args){
        printOddNum(0, 5, 0);
    }
}
