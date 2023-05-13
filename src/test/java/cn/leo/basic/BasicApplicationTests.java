package cn.leo.basic;

import cn.leo.basic.model.system.Status;
import cn.leo.basic.model.system.SystemDepartmentEntity;
import cn.leo.basic.service_system.repository.SystemDepartmentRepository;
import cn.leo.basic.service_system.repository.SystemRoleRepository;
import cn.leo.basic.service_system.service.impl.SystemRoleServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootTest
class BasicApplicationTests {
    @Autowired
    private SystemRoleRepository systemRoleRepository;
    @Autowired
    private SystemRoleServiceImpl systemRoleService;
    @Autowired
    private SystemDepartmentRepository departmentRepository;

    @Test
    void contextLoads() {

        SystemDepartmentEntity build1 = SystemDepartmentEntity.builder().name("硅谷集团有限公司").parent(null).treePath("1").sortValue(1).leader("张老师").phone("18790007789").status(Status.NORMAL).build();
        SystemDepartmentEntity build2 = SystemDepartmentEntity.builder().name("北京校区").parent(build1).treePath("1,10").sortValue(1).leader("李老师").phone("18790007789").status(Status.NORMAL).build();
        SystemDepartmentEntity build3 = SystemDepartmentEntity.builder().name("上海校区").parent(build1).treePath("1,20").sortValue(1).leader("王老师").phone("18790007789").status(Status.NORMAL).build();
        SystemDepartmentEntity build4 = SystemDepartmentEntity.builder().name("深圳校区").parent(build1).treePath("1,30").sortValue(1).leader("李老师").phone("18790007789").status(Status.NORMAL).build();
        SystemDepartmentEntity build5 = SystemDepartmentEntity.builder().name("教学部分").parent(build2).treePath("1,10,1010").sortValue(1).leader("李老师").phone("15464131").status(Status.NORMAL).build();
        SystemDepartmentEntity build6 = SystemDepartmentEntity.builder().name("运营部门").parent(build2).treePath("1,10,1020").sortValue(1).leader("张老师").phone("15464131").status(Status.NORMAL).build();
        SystemDepartmentEntity build7 = SystemDepartmentEntity.builder().name("Java学科").parent(build5).treePath("1,10,1010,1021").sortValue(1).leader("张老师").phone("15464131").status(Status.NORMAL).build();
        SystemDepartmentEntity build8 = SystemDepartmentEntity.builder().name("大数据学科").parent(build5).treePath("1,10,1010,1022").sortValue(1).leader("张老师").phone("15464131").status(Status.NORMAL).build();
        SystemDepartmentEntity build9 = SystemDepartmentEntity.builder().name("前端学科").parent(build5).treePath("1,10,1010,1024").sortValue(1).leader("张老师").phone("15464131").status(Status.NORMAL).build();
        SystemDepartmentEntity build10 = SystemDepartmentEntity.builder().name("客服").parent(build6).treePath("1,10,1010,1025").sortValue(1).leader("张老师").phone("15464131").status(Status.NORMAL).build();
        SystemDepartmentEntity build11 = SystemDepartmentEntity.builder().name("网站推广").parent(build6).treePath("1,10,1010,1026").sortValue(1).leader("张老师").phone("15464131").status(Status.NORMAL).build();
        SystemDepartmentEntity build12 = SystemDepartmentEntity.builder().name("线下运营").parent(build6).treePath("1,10,1010,1027").sortValue(1).leader("张老师").phone("15464131").status(Status.NORMAL).build();
        SystemDepartmentEntity build13 = SystemDepartmentEntity.builder().name("设计").parent(build6).treePath("1,10,1010,1028").sortValue(1).leader("张老师").phone("15464131").status(Status.NORMAL).build();
        SystemDepartmentEntity build14 = SystemDepartmentEntity.builder().name("教学部门").parent(build3).treePath("1,20,2012").sortValue(1).leader("张老师").phone("15464131").status(Status.NORMAL).build();
        SystemDepartmentEntity build15 = SystemDepartmentEntity.builder().name("教学部门").parent(build4).treePath("1,30,2013").sortValue(1).leader("张老师").phone("15464131").status(Status.NORMAL).build();
        SystemDepartmentEntity build16 = SystemDepartmentEntity.builder().name("Java学科").parent(build14).treePath("1,20,2012,2012").sortValue(1).leader("张老师").phone("15464131").status(Status.NORMAL).build();
        SystemDepartmentEntity build17 = SystemDepartmentEntity.builder().name("大数据学科").parent(build14).treePath("1,20,2012,2012").sortValue(1).leader("张老师").phone("15464131").status(Status.NORMAL).build();

        List<SystemDepartmentEntity> entities = List.of(build1, build2, build3, build4, build5, build6, build7, build8, build9, build10, build11, build12, build13, build14, build15, build16, build17);
        departmentRepository.saveAll(entities);


    }

    @Test
    void serviceTest() {
        systemRoleService.findAll().forEach(System.out::println);
    }

    @Test
    void repoTest() {
        Optional<SystemDepartmentEntity> entity = departmentRepository.findById(UUID.fromString("2137d479-27c5-4aa6-9819-c30ff3e04346"));
        System.out.println((long) entity.orElseThrow().getChildren().size());
    }
}
