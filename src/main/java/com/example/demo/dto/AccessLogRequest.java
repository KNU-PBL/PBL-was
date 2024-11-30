package com.example.demo.dto;

import java.time.LocalDateTime;

public class AccessLogRequest {
    private String name;
    private LocalDateTime entryTime;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }
}
