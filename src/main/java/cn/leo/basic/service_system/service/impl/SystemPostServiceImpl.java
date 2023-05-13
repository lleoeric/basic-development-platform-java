package cn.leo.basic.service_system.service.impl;

import cn.leo.basic.common.service_util.BaseServiceImpl;
import cn.leo.basic.model.system.SystemMenuEntity;
import cn.leo.basic.model.system.SystemPostEntity;
import cn.leo.basic.service_system.repository.SystemMenuRepository;
import cn.leo.basic.service_system.repository.SystemPostRepository;
import cn.leo.basic.service_system.service.SystemDepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class SystemPostServiceImpl extends BaseServiceImpl<SystemPostEntity, UUID, SystemPostRepository> implements SystemDepartmentService {
    public SystemPostServiceImpl(SystemPostRepository repository) {
        super(repository);
    }
}
