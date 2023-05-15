package cn.leo.basic.model.system.mapper;

import cn.leo.basic.model.system.dtos.SystemUserDto;
import cn.leo.basic.model.system.entities.SystemUser;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {SystemDepartmentMapper.class, SystemPostMapper.class})
public interface SystemUserMapper {
    SystemUser toEntity(SystemUserDto systemUserDto);

    SystemUserDto toDto(SystemUser systemUser);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SystemUser partialUpdate(SystemUserDto systemUserDto, @MappingTarget SystemUser systemUser);
}