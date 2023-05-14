package cn.leo.basic.service_system.controller;

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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @Override
    public ResponseEntity<CollectionModel<EntityModel<SystemDepartmentDto>>> all() {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(String s) {
        return null;
    }


    @Override
    public ResponseEntity<?> update(SystemDepartmentDto entity) {
        return null;
    }

    @Override
    public ResponseEntity<?> save(SystemDepartmentDto entity) {
        return null;
    }
}
