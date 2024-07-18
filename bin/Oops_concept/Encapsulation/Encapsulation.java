//Encapsulation is mechanism of protecting data access directly from anyone.

//We cannot access data directly from one class to another class ,that the concept of encapsulation.

//So private access modifier plays most important role in encapsulation.

// We can access data by accessing method  from the class using object.

//Encapsulation is also known as bundling data and methods and operate on that data in a single unit.

// this keyword represents the current object in javascript.

package Oops_concept.Encapsulation;

class Human{
   private String name;
   private  int age;

   //method to getAge
   public int getAge(){
    return age;
   }

   //method to setAge
   public int setAge(int age){
    return  this.age = age;
   }

   //method to getName
   public String getName(){
    return name;
   }

   //method to setName
   public String setName(String name){
    return this.name = name;
   }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setAge(21);
        obj.setName("Sushil Chaudhary");

        System.out.println("Name of human : "+obj.getName());
        System.out.println("Age of human : "+obj.getAge());
    }    
}