package cn.leo.basic.repository;

import cn.leo.base.model.system.SystemDepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemDepartmentEntityRepository extends JpaRepository<SystemDepartmentEntity, UUID> {
}