package Recursion_in_java;

public class Sum_recursion {
    public static void mysum(int i,int num,int sum ){
        if(i == num){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        mysum(i+1, num, sum);
        }
    public static void main(String[]args){
        mysum(1,5,0);
    }
}
