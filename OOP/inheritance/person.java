package OOP.inheritance;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi! I am " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age); 
        this.major = major;
    }

    // Override introduce method
    @Override
    public void introduce() {
        System.out.println("Hi! I am " + name + " and I am " + age + " years old. I am a student taking " + major + "!");
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age); 
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hi! I am " + name + " and I am " + age + " years old. I am a teacher teaching the subject " + subject + "!");
    }
}

public class person {
    public static void main(String[] args) {
        Person person = new Person("Cody", 5);
        Student student = new Student("Mark Azalithen", 21, "Computer Science");
        Teacher teacher = new Teacher("Welt Yang", 500, "Irminsul");

        person.introduce();
        student.introduce();
        teacher.introduce();
    }
}