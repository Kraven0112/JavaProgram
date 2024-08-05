package Recursion_in_java;

public class EvenNum_recursion {
    public static void printEvenNum(int i,int num,int even){
        if(i > num){
            return;
        }
        if(i%2==0){
            even = i;
            System.out.println(even);
        }
        printEvenNum(i+1,num, even);
    }
    public static void main(String[]args){
        printEvenNum(0, 10, 0);
    }
}
