package cn.leo.basic.service_system.service.impl;

import cn.leo.basic.common.request_util.service.BaseServiceImpl;
import cn.leo.basic.model.system.entities.SystemMenu;
import cn.leo.basic.service_system.repository.SystemMenuRepository;
import cn.leo.basic.service_system.service.SystemDepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class SystemMenuServiceImpl extends BaseServiceImpl<SystemMenu, UUID, SystemMenuRepository> implements SystemDepartmentService {
    public SystemMenuServiceImpl(SystemMenuRepository repository) {
        super(repository);
    }
}
