package com.example.demo.controller;

import com.example.demo.dto.UnregisteredDetectionLogRequest;
import com.example.demo.entity.UnregisteredDetectionLog;
import com.example.demo.service.UnregisteredDetectionLogService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/unregistered-detections")
public class UnregisteredDetectionLogController {
    private final UnregisteredDetectionLogService service;

    public UnregisteredDetectionLogController(UnregisteredDetectionLogService service) {
        this.service = service;
    }

    @GetMapping
    public List<UnregisteredDetectionLog> getAllLogs() {
        return service.getAllLogs();
    }

    @GetMapping("/{id}")
    public UnregisteredDetectionLog getLogById(@PathVariable Integer id) {
        return service.getLogById(id);
    }

    @PostMapping
    public UnregisteredDetectionLog createLog(@RequestBody UnregisteredDetectionLogRequest request) {
        UnregisteredDetectionLog log = new UnregisteredDetectionLog();
        log.setDetectionTime(request.getDetectionTime());
        return service.saveLog(log);
    }
}
