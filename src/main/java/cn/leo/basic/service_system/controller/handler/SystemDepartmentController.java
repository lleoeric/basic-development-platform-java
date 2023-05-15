package cn.leo.basic.service_system.controller.handler;

import cn.leo.basic.common.request_util.controller.BaseController;
import cn.leo.basic.model.system.dtos.SystemDepartmentDto;
import cn.leo.basic.model.system.entities.SystemDepartment;
import cn.leo.basic.model.system.mapper.SystemDepartmentMapper;
import cn.leo.basic.service_system.service.impl.SystemDepartmentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/system/departments")
public class SystemDepartmentController implements BaseController<SystemDepartmentDto, String> {
    private final SystemDepartmentServiceImpl departmentService;
    private final SystemDepartmentMapper departmentMapper;


    @Override
    @GetMapping("{id}")
    public ResponseEntity<SystemDepartmentDto> one(@PathVariable String id) {
        UUID uuid = UUID.fromString(id);
        SystemDepartment department = departmentService.findById(uuid).orElseThrow();
        SystemDepartmentDto departmentDto = departmentMapper.toDto(department);

        return ResponseEntity.ok(departmentDto);
    }

    @GetMapping
    @Override
    public ResponseEntity<CollectionModel<EntityModel<SystemDepartmentDto>>> all() {
        List<SystemDepartmentDto> dtos = departmentService.findAll().stream().map(departmentMapper::toDto).toList();

        return null;
    }

    @Override
    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        departmentService.deleteById(UUID.fromString(id));
        return ResponseEntity.ok().build();
    }


    @Override
    @PatchMapping("{id}")
    public ResponseEntity<?> update(@PathVariable String id, SystemDepartmentDto entity) {
        SystemDepartment department = departmentService.findById(UUID.fromString(id)).orElseThrow();
        SystemDepartment mapperEntity = departmentMapper.toEntity(entity);


        return null;
    }

    @Override
    public ResponseEntity<?> save(SystemDepartmentDto entity) {
        return null;
    }
}
