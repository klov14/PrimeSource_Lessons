package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(23);
        Person person1 = new Person("Mark");
        animal1.showInfo();
        person1.showInfo();
        Info info1 = new Animal(1);
        Info info2 = new Person("Hulk");
        info1.showInfo();// we only have access to the common methods in the class ie getInfo. sleep won't work!
        info2.showInfo();
        outputInfo(info1);
        Animal animal2 = new Animal(667);
        Person person2 = new Person("Spider Man");
        outputInfo(animal1);
        outputInfo(person2);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
