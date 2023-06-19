package com.akibazcode.user;

import java.io.FileNotFoundException;
import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    List<User> readAndParseUsersFromFile(String path) throws FileNotFoundException;

}
