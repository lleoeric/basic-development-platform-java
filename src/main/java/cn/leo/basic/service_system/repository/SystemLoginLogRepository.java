package cn.leo.basic.service_system.repository;

import cn.leo.basic.model.system.SystemLoginLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemLoginLogRepository extends JpaRepository<SystemLoginLogEntity, UUID> {
}