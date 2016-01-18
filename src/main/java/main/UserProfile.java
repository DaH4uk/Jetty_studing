package main;

/**
 * Created by DaH4uk on 17.01.2016.
 */
public class UserProfile {
    private String login;
    private String password;
    private String email;

    public UserProfile(String name, String password, String email) {
        this.login = name;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
