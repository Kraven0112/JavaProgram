package Oops_concept.Inheritance;

class Grandparent{
    String property ="Three buildings";
    String totalProperty ="3 crore";
}
class Parent extends Grandparent{
    String car ="Thar";
    int balance = 2600000;
}
class Child extends Parent{
    String bike = "Kawasaki Ninja";
    int Amount = 1200000;
}

public class Multiple_inheritance {
    public static void main(String[] args){
        Child obj = new Child();

        System.out.println(obj.property);
        System.out.println(obj.totalProperty);
        System.out.println(obj.car);
        System.out.println(obj.balance);
        System.out.println(obj.bike);
        System.out.println(obj.Amount);
    }
}


// Inheritance oop concept is java where child class inherits all mathods and properties of parent class.

// If there are three class A,B and C, then class B inherits properties and methods from class A and class C inherits from class B, that is called multiple inheritance in javascript.