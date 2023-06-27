package com.akibazcode.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserFakerDataAccessServiceTest {
    private UserFakerDataAccessService userFakerDataAccessService;

    @BeforeEach
    public void setup() {
        userFakerDataAccessService = new UserFakerDataAccessService();
    }

    @Test
    @DisplayName("Should Return Fake Users List")
    void canReturnListOfFakeUsers() {
        List<User> listOfUsers = userFakerDataAccessService.getAllUsers();
        assertFalse(listOfUsers.isEmpty());
        assertEquals(20, listOfUsers.size());
    }
}
