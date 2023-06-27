package com.akibazcode.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserServiceTest {
    UserService userService;
    UserFakerDataAccessService userFakerDataAccessService;

    @BeforeEach
    public void setup() {
        userFakerDataAccessService = new UserFakerDataAccessService();
        userService = new UserService(userFakerDataAccessService);
    }

    @Test
    @DisplayName("Should Return User UUID As String")
    public void shouldReturnUserIds() {
        List<UUID> uuidList = userFakerDataAccessService.getAllUsers().stream()
                .map(User::getUserId)
                .toList();
        assertEquals(uuidList.size(), userService.getUserIds().split(" ").length);
        assertTrue(userService.getUserIds().contains(uuidList.get(0).toString()));
    }

    @Test
    @DisplayName("Should Return User Name By Id Search")
    public void shouldReturnUserNameByIdSearch() {
        String userId = userFakerDataAccessService.getAllUsers().get(0).getUserId().toString();
        String userName = userFakerDataAccessService.getAllUsers().get(0).getName();
        assertEquals(userName, userService.getUserNameById(userId));
    }
}