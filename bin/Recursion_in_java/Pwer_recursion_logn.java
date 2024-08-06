package Recursion_in_java;

public class Pwer_recursion_logn {
    public static int printlognpow(int x,int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        //n is even --because n is power 
        if(n % 2 == 0){
            return printlognpow(x, n/2) * printlognpow(x, n/2);
        }
        else{
            return printlognpow(x, n/2) * printlognpow(x, n/2)* x;
        }
    }
    public static void main(String[]args){
        int x = 2;
        int n = 5;
        int ans = printlognpow(x,n);
        System.out.println(ans);
    }
}
