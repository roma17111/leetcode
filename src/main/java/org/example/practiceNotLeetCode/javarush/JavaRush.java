package org.example.practiceNotLeetCode.javarush;

import lombok.SneakyThrows;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class JavaRush {
    @SneakyThrows
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int a = ThreadLocalRandom.current().nextInt(100);
        System.out.println(a);
    }
}
