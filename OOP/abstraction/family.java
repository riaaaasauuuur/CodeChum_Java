package OOP.abstraction;

abstract class FamilyMember {
    abstract void greet();
}

class Mother extends FamilyMember {
    @Override
    void greet() {
        System.out.println("Mother knows best.");
    }
}

class Father extends FamilyMember {
    @Override
    void greet() {
        System.out.println("I am your father.");
    }
}

class Child extends FamilyMember {
    @Override
    void greet() {
        System.out.println("My father and mother love me.");
    }
}

public class family {
    public static void main(String[] args) {
        Mother mom = new Mother();
        Father dad = new Father();
        Child child = new Child();
        
        mom.greet();
        dad.greet();
        child.greet();
    }
}
