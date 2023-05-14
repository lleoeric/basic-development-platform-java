package cn.leo.basic.service_system.repository;

import cn.leo.basic.model.system.entities.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemUserRepository extends JpaRepository<SystemUser, UUID> {
}