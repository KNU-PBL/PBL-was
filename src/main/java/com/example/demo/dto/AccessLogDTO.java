package com.example.demo.dto;

import java.time.LocalDateTime;

public class AccessLogDTO {

    private Integer id;
    private String userName; // User의 이름
    private LocalDateTime entryTime;

    // Constructor
    public AccessLogDTO(Integer id, String userName, LocalDateTime entryTime) {
        this.id = id;
        this.userName = userName;
        this.entryTime = entryTime;
    }

    // Getter and Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }
}
