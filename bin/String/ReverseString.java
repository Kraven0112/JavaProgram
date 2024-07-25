package String;

public class ReverseString {
    public static void main(String[]args){
        String name = "Sushil";

        for(int i=name.length(); i>0; i--){
            System.out.print(name.charAt(i-1));
        }
    }
}
