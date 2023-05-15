package cn.leo.basic.service_system.controller.processor;

import cn.leo.basic.model.system.dtos.SystemDepartmentDto;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;

/**
 * 对链接进行细小调节，在assembler之后
 */
public class SystemDepartmentProcessor implements RepresentationModelProcessor<EntityModel<SystemDepartmentDto>> {
    @Override
    public EntityModel<SystemDepartmentDto> process(EntityModel<SystemDepartmentDto> model) {

        return null;
    }
}
