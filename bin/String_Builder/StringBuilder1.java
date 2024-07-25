package String_Builder;

public class StringBuilder1 {
    public static void main(String[]args){
        StringBuilder mc = new StringBuilder("Sushil");

        for(int i=0; i<mc.length()/2; i++){
            int front = i;
            int back = mc.length()-1-i;

            char frontChar = mc.charAt(front);
            char backChar = mc.charAt(back);


            mc.setCharAt(front, backChar);
            mc.setCharAt(back, frontChar);

        }
        System.out.println(mc);
    }
}
//StringBuilder
//In java Strings are immutable
//charAt(index)
//setCharAt(index,character)
//insert(index,characetr)
//delete(start index,end index)
//append(character)