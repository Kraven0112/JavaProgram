package Oops_concept.Inheritance;

public class Hierarchical {
    public static void main(String[] args){
        Horse horse = new Horse("Horse", "Hervivores");
        Cat cat = new Cat("Cat", "Omnivores");
        Dog dog = new Dog("Dog","Omnivores");


        horse.getDetail();
        cat.getDetail();
        dog.getDetail();
    }
}

class Animal{
    String name;
    String type;
    
    public Animal(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void getDetail(){
        System.out.println("Name of the animal : "+this.name);
        System.out.println("Type of animal : "+this.type);
    }
}

class Horse extends Animal{
    public Horse(String name, String type){
        super(name,type);
    }
}

class Dog extends Animal{
    public Dog(String name, String type){
        super(name,type);

    }
}

class Cat extends Animal{
    public Cat(String name, String type){
        super(name,type);
    }
}