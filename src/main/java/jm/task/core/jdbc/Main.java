package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Mick", "Chackev", (byte) 23);
        System.out.println("User с именем – Mick добавлен в базу данных");
        userService.saveUser("Raf", "Saev", (byte) 24);
        System.out.println("User с именем – Raf добавлен в базу данных");
        userService.saveUser("Leo", "Mechev", (byte) 25);
        System.out.println("User с именем – Leo добавлен в базу данных");
        userService.saveUser("Don", "Palckin", (byte) 22);
        System.out.println("User с именем – Don добавлен в базу данных");

        userService.getAllUsers().forEach(user -> System.out.println(user.toString()));
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
