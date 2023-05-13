package cn.leo.basic.service_system.repository;

import cn.leo.basic.model.system.SystemOperationLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemOperationLogRepository extends JpaRepository<SystemOperationLogEntity, UUID> {
}