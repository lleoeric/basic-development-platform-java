package cn.leo.basic;

import cn.leo.basic.model.system.entities.SystemRole;
import cn.leo.basic.service_system.repository.SystemRoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SystemRoleTest {
    @Autowired
    private SystemRoleRepository repository;

    @Test
    void initData(){
        repository.save(SystemRole.builder().roleName("系统管理员").roleCode("SYSTEM").description("系统管理员").build());
        repository.save(SystemRole.builder().roleName("普通管理员").roleCode("COMMON").description("普通管理员").build());
        repository.save(SystemRole.builder().roleName("用户管理员").roleCode("USER").description("用户管理员").build());

    }
}
