package com.example.demo.dto;

import java.time.LocalDateTime;

public class UnregisteredDetectionLogRequest {
    private LocalDateTime detectionTime;

    // Getter and Setter
    public LocalDateTime getDetectionTime() {
        return detectionTime;
    }

    public void setDetectionTime(LocalDateTime detectionTime) {
        this.detectionTime = detectionTime;
    }
}
