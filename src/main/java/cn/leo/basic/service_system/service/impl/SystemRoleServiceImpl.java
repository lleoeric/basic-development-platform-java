package cn.leo.basic.service_system.service.impl;

import cn.leo.basic.common.service_util.BaseServiceImpl;
import cn.leo.basic.model.system.SystemRoleEntity;
import cn.leo.basic.service_system.repository.SystemRoleRepository;
import cn.leo.basic.service_system.service.SystemRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class SystemRoleServiceImpl extends BaseServiceImpl<SystemRoleEntity, UUID, SystemRoleRepository> implements SystemRoleService {
    public SystemRoleServiceImpl(SystemRoleRepository repository) {
        super(repository);
    }
}
