package org.example.practiceNotLeetCode.taskUser.mapTask;

import java.util.List;
import java.util.Map;

public class SuperMain {
    public static void main(String[] args) {
        SuperUser user1 = new SuperUser("Roman", 30, 65234567);
        SuperUser user2 = new SuperUser("Sergey", 40, 233456);
        SuperUser user3 = new SuperUser("Alla", 10, 423456);
        SuperUser.addUser(user1);
        SuperUser.addUser(user2);
        SuperUser.addUser(user3);
        List<SuperUser> users = SuperUser.getAllUsers();
        Map<Integer, String> u = SuperUser.convertMap(users);
        for (Map.Entry<Integer, String> entry : u.entrySet()) {
            System.out.println("Номер телефона - " +entry.getKey()+ " Имя - "+ entry.getValue());
        }
    }
}
