package com.example.demo.repository;

import com.example.demo.entity.AccessLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessLogRepository extends JpaRepository<AccessLog, Integer> {
}
