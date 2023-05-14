package cn.leo.basic.service_system.controller;

import cn.leo.basic.common.request_util.controller.BaseController;
import cn.leo.basic.model.system.dtos.SystemRoleDto;
import cn.leo.basic.model.system.entities.SystemRole;
import cn.leo.basic.model.system.mapper.SystemRoleMapper;
import cn.leo.basic.service_system.assembler.SystemRoleAssembler;
import cn.leo.basic.service_system.repository.SystemRoleRepository;
import cn.leo.basic.service_system.service.impl.SystemRoleServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/system/roles")
public class SystemRoleController implements BaseController<SystemRoleDto, UUID> {
    private final SystemRoleServiceImpl roleService;
    private final SystemRoleMapper roleMapper;
    private final SystemRoleAssembler roleAssembler;

    @Override
    public ResponseEntity<SystemRoleDto> one(UUID uuid) {
        SystemRole role = roleService.findById(uuid).orElseThrow();
        SystemRoleDto roleDto = roleMapper.toDto(role);
        return ResponseEntity.ok(roleDto);
    }

    @Override
    public ResponseEntity<CollectionModel<EntityModel<SystemRoleDto>>> all() {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(UUID uuid) {
        return null;
    }

    @Override
    public ResponseEntity<?> update(SystemRoleDto entity) {
        return null;
    }

    @Override
    public ResponseEntity<?> save(SystemRoleDto entity) {
        return null;
    }
}
