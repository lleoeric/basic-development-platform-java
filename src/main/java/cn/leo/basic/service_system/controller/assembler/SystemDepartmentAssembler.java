package cn.leo.basic.service_system.controller.assembler;

import cn.leo.basic.model.system.dtos.SystemDepartmentDto;
import cn.leo.basic.model.system.entities.SystemDepartment;
import cn.leo.basic.model.system.mapper.SystemDepartmentMapper;
import cn.leo.basic.service_system.controller.handler.SystemDepartmentController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


public class SystemDepartmentAssembler extends RepresentationModelAssemblerSupport<SystemDepartment, SystemDepartmentDto> {

    private final SystemDepartmentMapper systemDepartmentMapper;

    /**
     * Creates a new {@link RepresentationModelAssemblerSupport} using the given controller class and resource type.
     *
     * @param controllerClass        must not be {@literal null}.
     * @param resourceType           must not be {@literal null}.
     * @param systemDepartmentMapper
     */
    public SystemDepartmentAssembler(Class<?> controllerClass, Class<SystemDepartmentDto> resourceType, SystemDepartmentMapper systemDepartmentMapper) {
        super(controllerClass, resourceType);
        this.systemDepartmentMapper = systemDepartmentMapper;
    }

    @Override
    public SystemDepartmentDto toModel(SystemDepartment entity) {
        SystemDepartmentDto model = systemDepartmentMapper.toDto(entity);
        model.add(linkTo(methodOn(SystemDepartmentController.class).all()).withRel("all"));

        return null;
    }


    @Override
    public CollectionModel<SystemDepartmentDto> toCollectionModel(Iterable<? extends SystemDepartment> entities) {
        return super.toCollectionModel(entities);
    }
}
