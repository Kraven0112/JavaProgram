package Recursion_in_java;

public class Factorial2_recursion {
    public static int printfactorial(int num){
        if(num == 1 || num== 0){
            return 1;
        }
        
        int value = printfactorial(num-1);
        int fibo = num * value;
        return fibo;

    }
    public static void main(String[]args){
        int num = 5;
        int output = printfactorial(num);
        System.out.println(output);
    }
    
}
