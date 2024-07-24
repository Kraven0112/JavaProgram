package String;

public class NewString {
public static void main(String[] args) {

    // String firstName="Sushil";
    // String lastName="Chaudhary";
    // String surName = "Chaudhary";

    //concatenation
    // String fullName = firstName+" "+lastName;
    // System.out.println("My name is "+fullName);

    //charAt(index) from String --- use for every character
    // for(int i=0; i<fullName.length(); i++){
    //     System.out.println(fullName.charAt(i));
    // }

    //comparing String using compareTo()
    // if(lastName.compareTo(surName) == 0){
    //     System.out.println("Strings are equal.");
    // }
    // else{
    //     System.out.println("Strings are not equal");
    // }

    //substring(begining index,ending index)
    //used to get word from any sentence
    // String sentence ="My name is Sushil Chaudhary";
    // String firstname = sentence.substring(11);
    // System.out.println(firstname);

    //Integer.parseInt() method is used to change string into integer
    // String num1 = "12345";

    // int myint = Integer.parseInt(num1);
    // System.out.println(myint);


    //Integer.toString() method is used to convert integer into string.

    int number1 = 12345678;

    String string = Integer.toString(number1);
    System.out.println(string.length());
}
}