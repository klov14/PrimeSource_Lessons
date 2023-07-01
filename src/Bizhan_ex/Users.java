package Bizhan_ex;

public class Users {
    protected String username;
    protected String password;

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public Users() {}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
