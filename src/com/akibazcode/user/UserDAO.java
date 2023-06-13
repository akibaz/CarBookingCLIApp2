package com.akibazcode.user;

import java.io.FileNotFoundException;
import java.util.List;

public interface UserDAO {
    String PATH = "src/com/akibazcode/users.csv";

    List<User> getAllUsers();

    List<User> readAndParseUsersFromFile(String path) throws FileNotFoundException;

}
