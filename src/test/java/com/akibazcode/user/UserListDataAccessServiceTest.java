package com.akibazcode.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class UserListDataAccessServiceTest {
    private UserListDataAccessService userListDataAccessService;

    @BeforeEach
    public void setup() {
        userListDataAccessService = new UserListDataAccessService();
    }

    @Test
    @DisplayName("Should Return Users List")
    void canReturnUsersList() {
        List<User> expectedUserList = List.of(
                new User("Baki", UUID.fromString("7e4b9220-a47a-45a7-a33b-7182ee0dc30e")),
                new User("Maki", UUID.fromString("0236e9db-8c46-45a1-8fef-718d12e271f3")),
                new User("Joki", UUID.fromString("43bf7ab5-1f20-4693-a4f0-7319a7926d66")),
                new User("Biki", UUID.fromString("1fda7774-b948-42fa-ad35-7eb1a7248e35"))
        );
        assertEquals(expectedUserList, userListDataAccessService.getAllUsers());
        assertFalse(() -> expectedUserList.size() == 0);
        assertEquals(4, expectedUserList.size());
        assertTrue(!expectedUserList.isEmpty());
        assertEquals(new User("Baki", UUID.fromString("7e4b9220-a47a-45a7-a33b-7182ee0dc30e")),
                expectedUserList.get(0));
    }
}
