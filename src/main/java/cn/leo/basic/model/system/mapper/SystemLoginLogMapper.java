package cn.leo.basic.model.system.mapper;

import cn.leo.basic.model.system.dtos.SystemLoginLogDto;
import cn.leo.basic.model.system.entities.SystemLoginLog;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SystemLoginLogMapper {
    SystemLoginLog toEntity(SystemLoginLogDto systemLoginLogDto);

    SystemLoginLogDto toDto(SystemLoginLog systemLoginLog);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SystemLoginLog partialUpdate(SystemLoginLogDto systemLoginLogDto, @MappingTarget SystemLoginLog systemLoginLog);
}