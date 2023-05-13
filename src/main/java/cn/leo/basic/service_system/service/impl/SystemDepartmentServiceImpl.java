package cn.leo.basic.service_system.service.impl;

import cn.leo.basic.common.service_util.BaseServiceImpl;
import cn.leo.basic.model.system.SystemDepartmentEntity;
import cn.leo.basic.model.system.SystemRoleEntity;
import cn.leo.basic.service_system.repository.SystemDepartmentRepository;
import cn.leo.basic.service_system.repository.SystemRoleRepository;
import cn.leo.basic.service_system.service.SystemDepartmentService;
import cn.leo.basic.service_system.service.SystemRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class SystemDepartmentServiceImpl extends BaseServiceImpl<SystemDepartmentEntity, UUID, SystemDepartmentRepository> implements SystemDepartmentService {
    public SystemDepartmentServiceImpl(SystemDepartmentRepository repository) {
        super(repository);
    }
}
