package cn.leo.basic.service_system.controller.handler;

import cn.leo.basic.common.request_util.controller.BaseController;
import cn.leo.basic.model.system.dtos.SystemUserDto;
import cn.leo.basic.service_system.service.impl.SystemUserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@AllArgsConstructor
@RestController
@RequestMapping("/system/users")
public class SystemUserController implements BaseController<SystemUserDto, String> {
    private final SystemUserServiceImpl userService;

    @Override
    @GetMapping("{id}")
    public ResponseEntity<SystemUserDto> one(@PathVariable String id) {
        linkTo(SystemUserController.class).slash(id).withSelfRel();
        return null;
    }

    @Override
    @GetMapping
    public ResponseEntity<CollectionModel<EntityModel<SystemUserDto>>> all() {
        return null;
    }

    @Override
    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }

    @Override
    @PatchMapping("{id}")
    public ResponseEntity<?> update(@PathVariable String id, SystemUserDto entity) {
        return null;
    }


    @Override
    @PostMapping
    public ResponseEntity<?> save(SystemUserDto entity) {
        return null;
    }
}
