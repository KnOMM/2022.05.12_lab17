package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        User admin = new User("admin","admin",Role.ADMIN);
        User manager = new User("manager","manager",Role.MANAGER);
        User client = new User("client","client",Role.CLIENT);
        User anonymous = new User("anonymous","anonymous",Role.ANONYMOUS);

        User[] users = {admin,manager,client,anonymous};

        Store storeATB = new Store("ATB","http/atb",users,null);

        while (true){
            tryLog(storeATB);
        }

    }

    static void tryLog(Store store){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter login: ");
        String login = scanner.nextLine();
        System.out.print("enter password: ");
        String password = scanner.nextLine();

        if (store.login(login,password)){
            store.getCurrentUserRights();
            store.logOut();
        }
        else {
            System.out.println("invalid login or password");
        }
    }
}
