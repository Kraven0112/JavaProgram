package Recursion_in_java;

public class Fibonacci_recursion {
    public static void printfiboseries(int a,int b,int num){ 
        if(num == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        
        printfiboseries(b, c, num-1);

    }
    public static void main(String[]args){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printfiboseries(a, b,n-2);
        
    }
}
