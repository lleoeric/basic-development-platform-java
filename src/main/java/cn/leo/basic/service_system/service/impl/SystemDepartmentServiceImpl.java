package cn.leo.basic.service_system.service.impl;

import cn.leo.basic.common.request_util.service.BaseServiceImpl;
import cn.leo.basic.model.system.entities.SystemDepartment;
import cn.leo.basic.service_system.repository.SystemDepartmentRepository;
import cn.leo.basic.service_system.service.SystemDepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class SystemDepartmentServiceImpl extends BaseServiceImpl<SystemDepartment, UUID, SystemDepartmentRepository> implements SystemDepartmentService {
    public SystemDepartmentServiceImpl(SystemDepartmentRepository repository) {
        super(repository);
    }
}
