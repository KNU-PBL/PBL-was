package com.example.demo.repository;

import com.example.demo.entity.UnregisteredDetectionLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnregisteredDetectionLogRepository extends JpaRepository<UnregisteredDetectionLog, Integer> {
}
