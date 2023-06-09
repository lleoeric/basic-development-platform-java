package cn.leo.basic.service_system.repository;

import cn.leo.basic.model.system.entities.SystemPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemPostRepository extends JpaRepository<SystemPost, UUID> {
}