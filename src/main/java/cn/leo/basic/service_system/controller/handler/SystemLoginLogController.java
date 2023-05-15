package cn.leo.basic.service_system.controller.handler;

import cn.leo.basic.common.request_util.controller.BaseController;
import cn.leo.basic.model.system.dtos.SystemDepartmentDto;
import cn.leo.basic.model.system.entities.SystemLoginLog;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/system/loginLogs")
public class SystemLoginLogController implements BaseController<SystemLoginLog, String> {
    @GetMapping("{id}")
    @Override
    public ResponseEntity<SystemLoginLog> one(@PathVariable String id) {
        return null;
    }

    @Override
    @GetMapping
    public ResponseEntity<CollectionModel<EntityModel<SystemLoginLog>>> all() {
        return null;
    }

    @Override
    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }

    @Override
    @PatchMapping("{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody SystemLoginLog entity) {
        return null;
    }

    @Override
    @PostMapping
    public ResponseEntity<?> save(@RequestBody SystemLoginLog entity) {
        return null;
    }
}
