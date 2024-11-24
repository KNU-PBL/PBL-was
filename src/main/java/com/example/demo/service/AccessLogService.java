package com.example.demo.service;

import com.example.demo.dto.AccessLogDTO;
import com.example.demo.entity.AccessLog;
import com.example.demo.repository.AccessLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccessLogService {

    private final AccessLogRepository accessLogRepository;

    public AccessLogService(AccessLogRepository accessLogRepository) {
        this.accessLogRepository = accessLogRepository;
    }

    public List<AccessLogDTO> getAllLogs() {
        return accessLogRepository.findAll().stream()
                .map(log -> new AccessLogDTO(
                        log.getId(),
                        log.getUser().getName(), // User의 이름 가져오기
                        log.getEntryTime()
                ))
                .collect(Collectors.toList());
    }

    public AccessLogDTO getLogById(Integer id) {
        AccessLog log = accessLogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Log not found"));
        return new AccessLogDTO(
                log.getId(),
                log.getUser().getName(),
                log.getEntryTime()
        );
    }

    public AccessLog saveLog(AccessLog log) {
        return accessLogRepository.save(log);
    }

    public void deleteLog(Integer id) {
        accessLogRepository.deleteById(id);
    }
}
