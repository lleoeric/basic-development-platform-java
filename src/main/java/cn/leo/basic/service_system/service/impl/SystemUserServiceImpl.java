package cn.leo.basic.service_system.service.impl;

import cn.leo.basic.common.request_util.service.BaseServiceImpl;
import cn.leo.basic.model.system.entities.SystemUser;
import cn.leo.basic.service_system.repository.SystemUserRepository;
import cn.leo.basic.service_system.service.SystemDepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class SystemUserServiceImpl extends BaseServiceImpl<SystemUser, UUID, SystemUserRepository> implements SystemDepartmentService {
    public SystemUserServiceImpl(SystemUserRepository repository) {
        super(repository);
    }
}
