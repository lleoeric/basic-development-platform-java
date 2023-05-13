package cn.leo.basic.service_system.repository;

import cn.leo.basic.model.system.SystemPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemPostRepository extends JpaRepository<SystemPostEntity, UUID> {
}