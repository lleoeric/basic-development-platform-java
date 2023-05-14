package cn.leo.basic.model.system.mapper;

import cn.leo.basic.model.system.dtos.SystemDepartmentDto;
import cn.leo.basic.model.system.entities.SystemDepartment;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SystemDepartmentMapper {
    SystemDepartment toEntity(SystemDepartmentDto systemDepartmentDto);

    SystemDepartmentDto toDto(SystemDepartment systemDepartment);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SystemDepartment partialUpdate(SystemDepartmentDto systemDepartmentDto, @MappingTarget SystemDepartment systemDepartment);

    @AfterMapping
    default void linkChildren(@MappingTarget SystemDepartment systemDepartment) {
        systemDepartment.getChildren().forEach(child -> child.setParent(systemDepartment));
    }
}