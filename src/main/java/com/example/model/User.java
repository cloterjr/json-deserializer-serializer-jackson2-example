package com.example.model;

import com.example.enums.StatusEnum;

import java.util.UUID;

public class User {
    private UUID userId;
    private String name;
    private StatusEnum status;

    public User(UUID userId, String name, StatusEnum status) {
        this.userId = userId;
        this.name = name;
        this.status = status;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
