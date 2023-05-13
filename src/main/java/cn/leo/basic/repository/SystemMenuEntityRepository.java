package cn.leo.basic.repository;

import cn.leo.base.model.system.SystemMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemMenuEntityRepository extends JpaRepository<SystemMenuEntity, UUID> {
}