package com.akibazcode.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class UserListDataAccessService implements UserDAO {

    @Override
    public List<User> getAllUsers() {
        List<User> usersList;
        try {
            usersList = readAndParseUsersFromFile(Objects.requireNonNull(getClass().getClassLoader().getResource("users.csv")).getPath());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return usersList;
    }

    @Override
    public List<User> readAndParseUsersFromFile(String path) throws FileNotFoundException {
        List<User> usersList = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        StringBuilder usersDataString = new StringBuilder();
        while (scanner.hasNext()) {
            usersDataString.append(scanner.nextLine()).append("#");
        }
        String[] usersDataArray = usersDataString.toString().split("#");
        String uuid;
        String name;
        String[] userDataArray;
        for (String s : usersDataArray) {
            userDataArray = s.split(",");
            uuid = userDataArray[0];
            name = userDataArray[1].strip();
            usersList.add(new User(name, UUID.fromString(uuid)));
        }
        return usersList;
    }
}
