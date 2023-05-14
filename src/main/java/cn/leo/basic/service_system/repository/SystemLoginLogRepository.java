package cn.leo.basic.service_system.repository;

import cn.leo.basic.model.system.entities.SystemLoginLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemLoginLogRepository extends JpaRepository<SystemLoginLog, UUID> {
}