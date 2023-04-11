package org.example.practiceNotLeetCode.taskUser.mapTask;

import lombok.*;

import javax.xml.namespace.QName;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Data
@NonNull
@ToString
public class SuperUser {

    private final String name;
    private final int age;
    private final int number;

    private static List<SuperUser> users = new ArrayList<>();


    public SuperUser(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
        System.out.println("test");
    }

    @NonNull
    public static void addUser(SuperUser user) {
        users.add(user);
    }

    public static List<SuperUser> getAllUsers() {
        return Collections.unmodifiableList(users);
    }

    public static Map<Integer, String> convertMap(List<SuperUser> users) {
        return users
                .stream()
                .collect(Collectors.toMap(SuperUser::getNumber, SuperUser::getName));
    }
}
