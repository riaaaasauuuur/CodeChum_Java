package OOP.inheritance;

class Animal{
    protected String sound;

    public Animal() {
        this.sound = "*Animal Sound*";
    }

    public String getSound() {
        return sound;
    }
}

class Bird extends Animal {
   
    public Bird() {
        super(); 
        this.sound = "*Chirp*"; 
    }
}

class Cat extends Animal {
    public Cat() {
        super(); 
        this.sound = "*Meow*"; 
    }
}

class Dog extends Animal {
  
    public Dog() {
        super();
        this.sound = "*Bark*"; 
    }
}

public class animals {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Animal sound: " + animal.getSound());
        System.out.println("Bird sound: " + bird.getSound());
        System.out.println("Cat sound: " + cat.getSound());
        System.out.println("Dog sound: " + dog.getSound());
    }
}