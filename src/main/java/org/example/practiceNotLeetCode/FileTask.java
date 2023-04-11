package org.example.practiceNotLeetCode;

import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileTask {
    @SneakyThrows
    public static void main(String[] args) throws IOException {
        Path pathFolder = Paths.get("new folder");
        Path file = pathFolder.resolve("Файл.txt");
        if (!Files.exists(pathFolder)) {
            Files.createDirectory(pathFolder);
        }
        if (!Files.exists(file)) {
            Files.createFile(file);
        }
        copyFile(file);
    }

    @SneakyThrows
    public static void copyFile(Path path) {
        Files.copy(path, Paths.get(path.getParent() + "\\копия " + path.getFileName()));
    }
}
