package cn.leo.basic.model.system.mapper;

import cn.leo.basic.model.system.dtos.SystemPostDto;
import cn.leo.basic.model.system.entities.SystemPost;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SystemPostMapper {
    SystemPost toEntity(SystemPostDto systemPostDto);

    SystemPostDto toDto(SystemPost systemPost);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SystemPost partialUpdate(SystemPostDto systemPostDto, @MappingTarget SystemPost systemPost);
}