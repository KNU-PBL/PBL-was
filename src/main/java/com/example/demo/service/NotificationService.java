package com.example.demo.service;

import com.example.demo.entity.Notification;
import com.example.demo.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    private final NotificationRepository repository;

    public NotificationService(NotificationRepository repository) {
        this.repository = repository;
    }

    public List<Notification> getAllNotifications() {
        return repository.findAll();
    }

    public Notification getNotificationById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
