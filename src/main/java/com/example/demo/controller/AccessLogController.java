package com.example.demo.controller;

import com.example.demo.dto.AccessLogDTO;
import com.example.demo.entity.AccessLog;
import com.example.demo.service.AccessLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/access-logs")
public class AccessLogController {
    private final AccessLogService accessLogService;

    public AccessLogController(AccessLogService accessLogService) {
        this.accessLogService = accessLogService;
    }

    // 모든 로그 조회
    @GetMapping
    public List<AccessLogDTO> getAllLogs() {
        return accessLogService.getAllLogs();
    }

    // 특정 로그 조회
    @GetMapping("/{id}")
    public AccessLogDTO getLogById(@PathVariable Integer id) {
        return accessLogService.getLogById(id);
    }

    // 새로운 로그 추가
    @PostMapping
    public AccessLog createLog(@RequestBody AccessLog log) {
        return accessLogService.saveLog(log);
    }

    // 로그 삭제
    @DeleteMapping("/{id}")
    public void deleteLog(@PathVariable Integer id) {
        accessLogService.deleteLog(id);
    }
}
