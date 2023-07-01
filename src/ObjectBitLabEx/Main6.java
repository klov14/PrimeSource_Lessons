package ObjectBitLabEx;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        User user1 = new User(1, "mk_galperin", "admin123", "admin");
        User user2 = new User(2, "student1", "student123", "student");
        User user3 = new User(3, "teacher1", "teacher123", "teacher");
        User user4 = new User(4,"student2", "student69", "student");
        User user5 = new User(5,"teacher2", "teacher69", "teacher");
        User user6 = new User(6,"student3", "student0000", "student");
        User[] listOfUsers = new User[]{user1, user2, user3, user4, user5, user5, user6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Login: ");
        String login1 = scanner.nextLine();
        System.out.print("Password: ");
        String password1 = scanner.nextLine();
        System.out.println(checking(listOfUsers, login1, password1));

//        for(int k =0;k<listOfUsers.length;k++){
//            System.out.println(listOfUsers[k].getLogin());
//        }
//    }
    }

    public static String checking(User[] users, String login, String password){
        Scanner scanner1 = new Scanner(System.in);
        int i;
        for(i = 0;i<users.length;i++){
            if(users[i].getLogin().equals(login) && users[i].getPassword().equals(password)){
                System.out.println("PRESS [1] TO EDIT LOGIN\nPRESS [2] TO CHANGE PASSWORD\nPRESS [3] TO LIST USERS\nPRESS [0] TO EXIT");
                int opt = scanner1.nextInt();
                if(opt==1){
                    System.out.print("Type your new login: ");
                    String newLogin = scanner1.nextLine();
                    scanner1.nextLine();
                    users[i].setLogin(newLogin);
                    return "Login has been changed";
                }
                else if(opt == 2){
                    System.out.print("Type your new password: ");
                    String newPassword = scanner1.nextLine();
                    scanner1.nextLine();
                    users[i].setLogin(newPassword);
                    return "Password has been changed";
                }
                else if(opt ==3){
                    for(int k=0;k<users.length;k++){
                        System.out.println(users[i].getLogin());
                    }
                    return " ";
                }
                    else if(opt==0){
                        return "Bye";
                    }
                    else{
                        return "Command not found";
                    }
                }
            }
        return "Not recognised";
    }

}
class User{
    private int id;
    private String login;
    private String password;
    private String role;

    public User() {}

    public User(int id, String login, String password, String role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User " + login;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

