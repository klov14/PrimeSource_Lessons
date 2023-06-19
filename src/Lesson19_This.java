public class Lesson19_This {
    public static void main(String[] args) {
        Human human1 = new Human("Peter");//human 1 - это обьект
//        human1.setName("Oliver");

//        human1.setAge(32);
        human1.getInfo();
    }
}
    class Human {
        private String name;
        private int age;

        public Human() {//конструктор
            this.name="Deafult name";
            this.age=0;
            System.out.println("Hello from 1 constructor");
        }
        public Human(String name){
            this.name=name;
            System.out.println("Hello from 2 constructor");
        }

        public Human(String name, int age){
            this.name=name;
            this.age=age;
            System.out.println("Hello from 3 constructor");
        }

        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public void getInfo() {
            System.out.println(name+","+age);
        }


    }


