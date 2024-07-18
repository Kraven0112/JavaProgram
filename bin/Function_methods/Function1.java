import java.util.Scanner;

public class Function1 {

    public void printName(String name){
        System.out.println("My name is :"+name);
        return;
    }

    public static void printAge(int age){
        System.out.println("I am "+age+" years old.");
        return;
    }
    public static void main(String[] args){
        Scanner mc = new Scanner (System.in);

        System.out.println("Enter your name please: ");
        String username = mc.nextLine();

        System.out.println("Enter your age please : ");
        int age = mc.nextInt();

        //used for non-static method or functon in java
        Function1 obj = new Function1();
        obj.printName(username);

        //used for static method or function in java
        //It is also calles static way to access static method in java
        Function1.printAge(age);
        mc.close();
    }
}

//nextLine() method in scanner class which is use to reas entire text from the input source.
//like that nextInt() is also a scanner method used to read entire integers from user input source.