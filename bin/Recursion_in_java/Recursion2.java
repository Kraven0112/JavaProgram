package Recursion_in_java;

public class Recursion2 {
    public static void printNum(int num){
        if(num == 6){
            return;
        }
        System.out.println(num);
        printNum(num+1);
    }
    public static void main(String[]args){
        printNum(1);
    }
}
