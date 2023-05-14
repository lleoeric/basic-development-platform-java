package cn.leo.basic.service_system.service.impl;

import cn.leo.basic.common.request_util.service.BaseServiceImpl;
import cn.leo.basic.model.system.entities.SystemPost;
import cn.leo.basic.service_system.repository.SystemPostRepository;
import cn.leo.basic.service_system.service.SystemDepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class SystemPostServiceImpl extends BaseServiceImpl<SystemPost, UUID, SystemPostRepository> implements SystemDepartmentService {
    public SystemPostServiceImpl(SystemPostRepository repository) {
        super(repository);
    }
}
