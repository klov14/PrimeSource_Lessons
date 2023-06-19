public class ClassAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("");
        person1.setAge(19);
        person1.speak();
        System.out.println("Printing the name and the age from the GET method: "+person1.getName()+" "+person1.getAge());
//        int year1=person1.retirement();
//        int year2=person2.retirement();

    }
}

class Person{
    private String name;
    private int age;

    public void setName(String username){
        if(username.isEmpty()){
            System.out.println("Your name is empty");
        }else{
            name = username;
        }
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        age = userAge;
    }
    public int getAge(){
        return age;
    }

    int retirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for(int i = 0;i<3;i++){
        System.out.println("My name is "+name+" and I am "+age);
    }
}}
