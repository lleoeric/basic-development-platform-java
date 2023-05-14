package cn.leo.basic.model.system.mapper;

import cn.leo.basic.model.system.dtos.SystemOperationLogDto;
import cn.leo.basic.model.system.entities.SystemOperationLog;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {SystemDepartmentMapper.class})
public interface SystemOperationLogMapper {
    SystemOperationLog toEntity(SystemOperationLogDto systemOperationLogDto);

    SystemOperationLogDto toDto(SystemOperationLog systemOperationLog);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SystemOperationLog partialUpdate(SystemOperationLogDto systemOperationLogDto, @MappingTarget SystemOperationLog systemOperationLog);
}