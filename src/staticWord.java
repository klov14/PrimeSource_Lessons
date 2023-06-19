public class staticWord {
    public static void main(String[] args) {
        People p1 = new People("Bob", 30);
        People p2 = new People("Tom", 22);
        People p3 = new People("Brad", 42);
        People.description = "Bad";
        p1.getInfo();
        p2.getInfo();
        People.description = "Nice";
        p1.getInfo();
        p2.getInfo();
        People.getDescription();
        People.printCountofPeople();

    }


}

class People {
    public static String description;
    private String name;
    private int age;
    private static int count;


    public People(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello from 3 constructor");
        count++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription() {//static methods works only with static initializers
        System.out.println(description);
    }
    public static void printCountofPeople(){
        System.out.println(count);
    }


    public void getInfo() {
        System.out.println(name + ", " + age + ", " + description);
    }



}

