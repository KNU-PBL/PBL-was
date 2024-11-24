package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer notificationId;

    @Column(nullable = false)
    private Integer ulogId;

    // Getters and Setters
    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public Integer getUlogId() {
        return ulogId;
    }

    public void setUlogId(Integer ulogId) {
        this.ulogId = ulogId;
    }
}
