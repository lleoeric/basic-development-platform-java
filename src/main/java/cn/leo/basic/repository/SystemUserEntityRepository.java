package cn.leo.basic.repository;

import cn.leo.basic.model.system.SystemUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemUserEntityRepository extends JpaRepository<SystemUserEntity, UUID> {
}