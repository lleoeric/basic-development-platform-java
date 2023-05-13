package cn.leo.basic.service_system.repository;

import cn.leo.basic.model.system.SystemDepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemDepartmentRepository extends JpaRepository<SystemDepartmentEntity, UUID> {
}