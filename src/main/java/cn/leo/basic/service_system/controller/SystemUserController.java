package cn.leo.basic.service_system.controller;

import cn.leo.basic.common.request_util.controller.BaseController;
import cn.leo.basic.model.system.dtos.SystemUserDto;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/system/users")
public class SystemUserController implements BaseController<SystemUserDto, UUID> {
    @Override
    public ResponseEntity<SystemUserDto> one(UUID uuid) {
        return null;
    }

    @Override
    public ResponseEntity<CollectionModel<EntityModel<SystemUserDto>>> all() {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(UUID uuid) {
        return null;
    }

    @Override
    public ResponseEntity<?> update(SystemUserDto entity) {
        return null;
    }

    @Override
    public ResponseEntity<?> save(SystemUserDto entity) {
        return null;
    }
}
