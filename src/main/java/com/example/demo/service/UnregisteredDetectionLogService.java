package com.example.demo.service;

import com.example.demo.entity.UnregisteredDetectionLog;
import com.example.demo.repository.UnregisteredDetectionLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnregisteredDetectionLogService {
    private final UnregisteredDetectionLogRepository repository;

    public UnregisteredDetectionLogService(UnregisteredDetectionLogRepository repository) {
        this.repository = repository;
    }

    public List<UnregisteredDetectionLog> getAllLogs() {
        return repository.findAll();
    }

    public UnregisteredDetectionLog getLogById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Log not found with id: " + id));
    }

    public UnregisteredDetectionLog saveLog(UnregisteredDetectionLog log) {
        return repository.save(log);
    }
}
