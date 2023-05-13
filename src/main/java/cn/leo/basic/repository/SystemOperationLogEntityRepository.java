package cn.leo.basic.repository;

import cn.leo.basic.model.system.SystemOperationLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemOperationLogEntityRepository extends JpaRepository<SystemOperationLogEntity, UUID> {
}