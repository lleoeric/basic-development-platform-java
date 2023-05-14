package cn.leo.basic.service_system.service.impl;

import cn.leo.basic.common.request_util.service.BaseServiceImpl;
import cn.leo.basic.model.system.entities.SystemLoginLog;
import cn.leo.basic.service_system.repository.SystemLoginLogRepository;
import cn.leo.basic.service_system.service.SystemRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class SystemLoginLogServiceImpl extends BaseServiceImpl<SystemLoginLog, UUID, SystemLoginLogRepository> implements SystemRoleService {
    public SystemLoginLogServiceImpl(SystemLoginLogRepository repository) {
        super(repository);
    }
}
