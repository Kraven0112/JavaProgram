package Recursion_in_java;

public abstract class Power_recursion {
    public static int printpower(int x,int n){
        if(n == 0 || x == 0){
            return 1;
        }
        int xpow = printpower(x, n-1);
        int pow = x*xpow;

        return pow;
    }
    public static void main(String[]args){
        int  x = 2;
        int n = 5;
        
        int ans = printpower(x, n);
        System.out.println(ans);
    }
}
