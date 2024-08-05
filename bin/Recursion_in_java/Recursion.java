package Recursion_in_java;

public class Recursion {
    public static void printNum(int num){
        if(num == 0){
            return ;
        }
        System.out.println(num);
        printNum(num-1);
    }
public static void main(String[]args){
printNum(5);
}

}