package com.company;

public class User {
    /**
     * It is a class where user is described.
     * User has login, password and role. They can log in.
     * role by default - anonymous.
     */
    private String login;
    private String password;
    private Role role = Role.ANONYMOUS;

    public User(String login, String password, Role role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
