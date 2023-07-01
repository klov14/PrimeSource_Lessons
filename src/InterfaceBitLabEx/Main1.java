package InterfaceBitLabEx;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Users user1 = new Users("Mark", "Galperin");
        Users user2 = new Users("Alex", "Wallet");
        Users user3 = new Users("Ben", "Diesel");
        Users user4 = new Users("Paul", "Smith");
        Users user5 = new Users("Vin", "Diesel");
        Users[] listOfUsers = new Users[]{user1, user2, user3, user4, user5};
        UserBeanImp new1 = new UserBeanImp(listOfUsers);
        new1.getUsersBySurname("Diesel");

    }
}

class Users{
    private String name;
    private String surname;

    public Users(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Users(){}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
interface UserBean{
    public void getAllUsers();
    public void getUsersByName(String name);
    void getUsersBySurname(String surname);
}

class UserBeanImp implements UserBean{
    private Users[] users;

    public UserBeanImp(Users[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for(int i = 0; i < users.length;i++){
            System.out.println(users[i].getName() + " " + users[i].getSurname());
        }
    }

    @Override
    public void getUsersByName(String name) {
        int i = 0;
        while(i<users.length){
            if(users[i].getName()==name){
                System.out.println(users[i].getName() + " " + users[i].getSurname());
                break;
            }
            else {
                i++;
            }
        }
    }

    @Override
    public void getUsersBySurname(String surname) {
        int i = 0;
        while(i<users.length){
            if(users[i].getSurname()==surname){
                System.out.println(users[i].getName() + " " + users[i].getSurname());
                break;
            }
            else {
                i++;
            }
        }
    }
}