package cn.leo.basic.repository;

import cn.leo.basic.model.system.SystemPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemPostEntityRepository extends JpaRepository<SystemPostEntity, UUID> {
}