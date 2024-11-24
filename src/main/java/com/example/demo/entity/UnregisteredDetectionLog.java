package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "unregistered_detection_log")
public class UnregisteredDetectionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ulogId;

    @Column(nullable = false)
    private LocalDateTime detectedTime;

    // Getters and Setters
    public Integer getUlogId() {
        return ulogId;
    }

    public void setUlogId(Integer ulogId) {
        this.ulogId = ulogId;
    }

    public LocalDateTime getDetectedTime() {
        return detectedTime;
    }

    public void setDetectedTime(LocalDateTime detectedTime) {
        this.detectedTime = detectedTime;
    }
}
