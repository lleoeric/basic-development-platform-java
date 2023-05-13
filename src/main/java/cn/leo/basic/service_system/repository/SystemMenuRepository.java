package cn.leo.basic.service_system.repository;

import cn.leo.basic.model.system.SystemMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemMenuRepository extends JpaRepository<SystemMenuEntity, UUID> {
}