package cn.leo.basic.service_system.repository;

import cn.leo.basic.model.system.SystemRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemRoleRepository extends JpaRepository<SystemRoleEntity, UUID> {
}