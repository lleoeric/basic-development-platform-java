package cn.leo.basic.service_system.service.impl;

import cn.leo.basic.common.service_util.BaseServiceImpl;
import cn.leo.basic.model.system.SystemDepartmentEntity;
import cn.leo.basic.model.system.SystemMenuEntity;
import cn.leo.basic.service_system.repository.SystemDepartmentRepository;
import cn.leo.basic.service_system.repository.SystemMenuRepository;
import cn.leo.basic.service_system.service.SystemDepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class SystemMenuServiceImpl extends BaseServiceImpl<SystemMenuEntity, UUID, SystemMenuRepository> implements SystemDepartmentService {
    public SystemMenuServiceImpl(SystemMenuRepository repository) {
        super(repository);
    }
}
