package cn.leo.basic.model.system.mapper;

import cn.leo.basic.model.system.dtos.SystemRoleDto;
import cn.leo.basic.model.system.entities.SystemRole;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SystemRoleMapper {
    SystemRole toEntity(SystemRoleDto systemRoleDto);

    SystemRoleDto toDto(SystemRole systemRole);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SystemRole partialUpdate(SystemRoleDto systemRoleDto, @MappingTarget SystemRole systemRole);
}