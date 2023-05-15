package cn.leo.basic.service_system.controller.handler;

import cn.leo.basic.common.request_util.controller.BaseController;
import cn.leo.basic.model.system.dtos.SystemRoleDto;
import cn.leo.basic.model.system.entities.SystemRole;
import cn.leo.basic.model.system.mapper.SystemRoleMapper;
import cn.leo.basic.service_system.controller.assembler.SystemRoleAssembler;
import cn.leo.basic.service_system.service.impl.SystemRoleServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/system/roles")
public class SystemRoleController implements BaseController<SystemRoleDto, String> {
    private final SystemRoleServiceImpl roleService;
    private final SystemRoleMapper roleMapper;

    @Override
    @GetMapping("{id}")
    public ResponseEntity<SystemRoleDto> one(@PathVariable String id) {
        SystemRole role = roleService.findById(UUID.fromString(id)).orElseThrow();
        SystemRoleDto roleDto = roleMapper.toDto(role);
        return ResponseEntity.ok(roleDto);
    }

    @Override
    public ResponseEntity<CollectionModel<EntityModel<SystemRoleDto>>> all() {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<SystemRoleDto>> allEntities() {
        List<SystemRoleDto> roleDtos = roleService.findAll().stream().map(roleMapper::toDto).toList();
        return ResponseEntity.ok(roleDtos);
    }

    @Override
    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {

        return null;
    }

    @Override
    public ResponseEntity<?> update(String uuid, SystemRoleDto entity) {
        return null;
    }


    @Override
    public ResponseEntity<?> save(SystemRoleDto entity) {
        return null;
    }
}
