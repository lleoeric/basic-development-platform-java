package cn.leo.basic.service_system.repository;

import cn.leo.basic.model.system.entities.SystemMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemMenuRepository extends JpaRepository<SystemMenu, UUID> {
}