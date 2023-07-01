package Bizhan_ex;

import java.io.File;

class Admin extends Users{
    private String name;
    private Users listOfUsers[] = new Users[100];
    private int countOfUsers = 0;

    public Admin(String username, String password, String name) {
        super(username, password);
        this.name = name;
    }

    public void addNewUsers(String login_type, String password_type){
//        System.out.println("Choose student or teacher: ");
        Users user1 = new Users(login_type, password_type);
        listOfUsers[countOfUsers++] = user1;
    }

}
