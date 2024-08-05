package Recursion_in_java;

public class Factorial_recursion {
    public static void printMultiply(int i,int num,int mult){
        if(i == num){
            mult *= i;
            System.out.println(mult);
            return;
        }

        mult *= i;
        printMultiply(i+1, num, mult);
    }
    public static void main(String[]args){
        printMultiply(1, 5, 1);
    }
    
}
