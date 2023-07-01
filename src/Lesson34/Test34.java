package Lesson34;

import Lesson_29.Animal;
import Lesson_29.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test34 {
    public static void main(String[] args) {
        List<Animal34> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal34(65));
        listOfAnimals.add(new Animal34(54));
        test2(listOfAnimals);

        List<Dog34> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog34());
        listOfDogs.add(new Dog34());
        test2(listOfDogs);
        Animal34 animal1 = new Animal34();
        animal1.eat();
        Animal34 animal2 = new Animal34(){
        public void eat(){
            System.out.println("Animal 2 is eating");
        }

    };
        animal2.eat();
    }
    public static void test2(List<? extends Animal34> list){
        for(Animal34 animal:list){
             System.out.println(animal);
        }
    }
}
