package com.akibazcode.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class UserListDataAccessService implements UserDAO {

    @Override
    public List<User> getAllUsers() {
        List<User> usersList;
        try {
            usersList = readAndParseUsersFromFile(PATH);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return usersList;
    }

    @Override
    public List<User> readAndParseUsersFromFile(String path) throws FileNotFoundException {
        List<User> usersList = new ArrayList<>();
        User[] users;
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        StringBuilder usersDataString = new StringBuilder();
        while (scanner.hasNext()) {
            usersDataString.append(scanner.nextLine()).append("#");
        }
        String[] usersDataArray = usersDataString.toString().split("#");
        users = new User[usersDataArray.length];
        String uuid;
        String name;
        String[] userDataArray;
        for (int i = 0; i < usersDataArray.length; i++) {
            userDataArray = usersDataArray[i].split(",");
            uuid = userDataArray[0];
            name = userDataArray[1].strip();
            usersList.add(new User(name, UUID.fromString(uuid)));
        }
        return usersList;
    }
}
