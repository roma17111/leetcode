package org.example.practiceNotLeetCode.taskUser;

import lombok.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@NonNull
@ToString(of = {
        "name","age"
})
public class User {
    private String name;
    private int age;

    private static List<User> users = new ArrayList<>();

    public static void addUserToList(User user) {
        users.add(user);
    }

    public static List<User> getAllUsers() {
        return Collections.unmodifiableList(users);
    }

    public static User sortedUsers(List<User> users) {
        List<User> u = users
                .stream()
                .distinct()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
        return u.get(u.size() - 1);
    }
}
