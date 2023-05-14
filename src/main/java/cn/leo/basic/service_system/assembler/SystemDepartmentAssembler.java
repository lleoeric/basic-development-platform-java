package cn.leo.basic.service_system.assembler;

import cn.leo.basic.model.system.mapper.SystemDepartmentMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SystemDepartmentAssembler {
    private final SystemDepartmentMapper systemDepartmentMapper;
}
