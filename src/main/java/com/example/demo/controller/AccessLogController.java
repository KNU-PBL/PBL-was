package com.example.demo.controller;

import com.example.demo.dto.AccessLogDTO;
import com.example.demo.dto.AccessLogRequest;
import com.example.demo.entity.AccessLog;
import com.example.demo.entity.User;
import com.example.demo.service.AccessLogService;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/access-logs")
public class AccessLogController {
    private final AccessLogService accessLogService;
    private final UserService userService;

    public AccessLogController(AccessLogService accessLogService, UserService userService) {
        this.accessLogService = accessLogService;
        this.userService = userService;
    }

    @GetMapping
    public List<AccessLogDTO> getAllLogs() {
        return accessLogService.getAllLogs();
    }

    @GetMapping("/{id}")
    public AccessLogDTO getLogById(@PathVariable Integer id) {
        return accessLogService.getLogById(id);
    }

    @PostMapping
    public AccessLog createLog(@RequestBody AccessLogRequest request) {
        // User의 정보를 name으로 조회
        User user = userService.getUserByName(request.getName());

        if (user == null) {
            throw new IllegalArgumentException("해당 이름을 가진 사용자가 없습니다.");
        }

        // AccessLog 엔티티 생성 및 저장
        AccessLog log = new AccessLog();
        log.setUser(user); // User 객체 설정
        log.setEntryTime(request.getEntryTime());
        return accessLogService.saveLog(log);
    }

    @DeleteMapping("/{id}")
    public void deleteLog(@PathVariable Integer id) {
        accessLogService.deleteLog(id);
    }
}
