//we cannit create an object of an absstract class in java,because abstract is incomplete itself.
//and we cannot implement abstact method in abstract class.
//we can create non-abstract method in abstract class in java.

package Oops_concept.Abstraction;

public class Abstraction {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.getDetail("Dog", 3);
        dog.getMessage();
        Dog.getMessage1();
        dog.getSound();
    }
}

abstract class Animal{
    String name;
    int age;
 public abstract void getDetail(String name,int age);
 public abstract void getSound();
 public void getMessage(){
   System.out.println("I am non-abstract method");
 }
 static void getMessage1(){
    System.out.println("--> We can create static method in abstract class.");
    System.out.println("--> Static methods are accessed by class that is called static way to access static method in java .");
 }
}


class Dog extends Animal{
    public void getDetail(String name, int age){
        System.out.println(name +" : "+ age);
    }
    public void getSound(){
        System.out.println("Animal makes less sound than human things.");
        System.out.println("--> We cannot create an object of abstract class.");
        System.out.println("--> abstract in not actual design of any system but known as virtual blueprint like an interface.");
    }
}