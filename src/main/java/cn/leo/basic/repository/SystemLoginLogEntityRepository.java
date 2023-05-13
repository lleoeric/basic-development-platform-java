package cn.leo.basic.repository;

import cn.leo.basic.model.system.SystemLoginLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemLoginLogEntityRepository extends JpaRepository<SystemLoginLogEntity, UUID> {
}