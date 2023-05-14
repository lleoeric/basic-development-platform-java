package cn.leo.basic.service_system.repository;

import cn.leo.basic.model.system.entities.SystemRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemRoleRepository extends JpaRepository<SystemRole, UUID> {
}