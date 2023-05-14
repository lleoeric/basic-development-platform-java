package cn.leo.basic.model.system.mapper;

import cn.leo.basic.model.system.dtos.SystemMenuDto;
import cn.leo.basic.model.system.entities.SystemMenu;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SystemMenuMapper {
    SystemMenu toEntity(SystemMenuDto systemMenuDto);

    SystemMenuDto toDto(SystemMenu systemMenu);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SystemMenu partialUpdate(SystemMenuDto systemMenuDto, @MappingTarget SystemMenu systemMenu);

    @AfterMapping
    default void linkChildren(@MappingTarget SystemMenu systemMenu) {
        systemMenu.getChildren().forEach(child -> child.setParentId(systemMenu));
    }
}