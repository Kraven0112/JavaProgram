package Recursion_in_java;

public class Recursion_reverse_string {
    public static void reverseString(String string,char empty,int i){
        if(i == 0){
            empty = string.charAt(i);
            System.out.print(empty);
            return ;
        }
        empty = string.charAt(i);
        System.out.print(empty);
        reverseString(string, empty, i-1);

        
    }
    public static void main(String[]args){
        String myName = "sushil";
        char empty = ' ';
        int index = myName.length()-1;

        reverseString(myName, empty, index);

    }
}
