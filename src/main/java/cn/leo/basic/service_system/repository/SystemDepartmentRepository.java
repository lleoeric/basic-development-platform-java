package cn.leo.basic.service_system.repository;

import cn.leo.basic.model.system.entities.SystemDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemDepartmentRepository extends JpaRepository<SystemDepartment, UUID> {
}