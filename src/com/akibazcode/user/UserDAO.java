package com.akibazcode.user;

import java.io.FileNotFoundException;

public interface UserDAO {
    String PATH = "src/com/akibazcode/users.csv";

    User[] getAllUsers();

    User[] readAndParseUsersFromFile(String path) throws FileNotFoundException;

}
