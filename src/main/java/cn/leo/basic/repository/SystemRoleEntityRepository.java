package cn.leo.basic.repository;

import cn.leo.basic.model.system.SystemRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemRoleEntityRepository extends JpaRepository<SystemRoleEntity, UUID> {
}