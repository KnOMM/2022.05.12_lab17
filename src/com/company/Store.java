package com.company;

public class Store  {
    /**
     * It is a store class with the array of users.
     * The store has a label, url and the current user.
     */

    private String name;
    private String url;
    private User[] users;
    private User currentUser;

    public Store(String name, String url, User[] users, User currentUser) {
        this.name = name;
        this.url = url;
        this.users = users;
        this.currentUser = currentUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    boolean login(String loginUser, String passwordUser){
        for (User user : users) {
            if (user.getLogin().equals(loginUser) && user.getPassword().equals(passwordUser)){
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    void logOut(){
        currentUser = null;
        System.out.println("You logged out");
    }

    void getCurrentUserRights(){
        switch (currentUser.getRole()){
            case ADMIN -> System.out.println("You are an admin");
            case CLIENT -> System.out.println("You are a client");
            case MANAGER -> System.out.println("You are a manager");
            case ANONYMOUS -> System.out.println("You are an anonymous");
            default -> System.out.println("You are not authorized yet");
        }
    }
}
