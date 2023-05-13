package cn.leo.basic;

import cn.leo.basic.model.system.Status;
import cn.leo.basic.model.system.SystemLoginLogEntity;
import cn.leo.basic.service_system.repository.SystemLoginLogRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SystemLoginLogTest {

    @Autowired
    private SystemLoginLogRepository loginLogRepository;

    @Test
    void initData() {
        loginLogRepository.save(SystemLoginLogEntity.builder().username("admin").ipAddress("0.0.0.0").status(Status.NORMAL).message("登录成功").build());
        loginLogRepository.save(SystemLoginLogEntity.builder().username("admin").ipAddress("127.0.0.1").status(Status.NORMAL).message("登录成功").build());
    }

    @Test
    void getData() {
        System.out.println(loginLogRepository.findAll());
    }
}
