package org.example.practiceNotLeetCode.taskUser;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User("Roman",30);
        User user2 = new User("Roman",30);
        User user3 = new User("Evgeniy",40);
        User user4 = new User("Evgeniy",40);
        User user5 = new User("Vasiliy",60);
        User.addUserToList(user1);
        User.addUserToList(user2);
        User.addUserToList(user3);
        User.addUserToList(user4);
        User.addUserToList(user5);
        System.out.println(User.sortedUsers(User.getAllUsers()));
    }
}
