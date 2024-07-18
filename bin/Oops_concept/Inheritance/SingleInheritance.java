package Oops_concept.Inheritance;

public class SingleInheritance {
    public static void main(String[] args){
        Child obj = new Child();
        
        System.out.println(obj.property);
        System.out.println(obj.price);
    }
}
class Parents{
    String property = "Building";
    int price = 150000;

    void getDetail(){
        System.out.println(property);
        System.out.println(price);
    }
}

class Child extends Parents{
    void getChild(){
        System.out.println("I am child class.");
    }
}


// Inheritance oop concept is java where child class inherits all mathods and properties of parent class.

// Single inheritance is a mechanism where only one parent class and child class existed , then child class inherits all properties and methods of parent class.

//if there are two classes A and B, then B class inherits all properties and methods of class A , that is called single inheritance.