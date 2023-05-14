package cn.leo.basic.service_system.service.impl;

import cn.leo.basic.common.request_util.service.BaseServiceImpl;
import cn.leo.basic.model.system.entities.SystemOperationLog;
import cn.leo.basic.service_system.repository.SystemOperationLogRepository;
import cn.leo.basic.service_system.service.SystemDepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class SystemOperationLogServiceImpl extends BaseServiceImpl<SystemOperationLog, UUID, SystemOperationLogRepository> implements SystemDepartmentService {
    public SystemOperationLogServiceImpl(SystemOperationLogRepository repository) {
        super(repository);
    }
}
