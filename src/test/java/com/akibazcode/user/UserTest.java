package com.akibazcode.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User baki;

    @BeforeEach
    public void setup() {
        baki = new User(
                "Baki",
                UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3")
        );
    }

    @Test
    @DisplayName("Should Return User Name String")
    void canGetName() {
        var name = baki.getName();
        assertEquals("Baki", name);
    }

    @Test
    @DisplayName("Should Return User UUID")
    void canGetUUID() {
        var userId = baki.getUserId();
        var expectedUserID = UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3");
        assertEquals(expectedUserID, userId);
    }

}
