package cn.leo.basic;

import cn.leo.basic.model.system.base.Status;
import cn.leo.basic.model.system.entities.SystemPost;
import cn.leo.basic.service_system.repository.SystemPostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SystemPostTest {
    @Autowired
    private SystemPostRepository postRepository;
    @Test
    void initData(){
        postRepository.save(SystemPost.builder().postCode("leo eric").name("董事长").description("1").status(Status.NORMAL).build());
        postRepository.save(SystemPost.builder().postCode("leoeric").name("总经理").description("2").status(Status.NORMAL).build());
        postRepository.save(SystemPost.builder().postCode("leoeric123").name("网络咨询").status(Status.NORMAL).build());
        postRepository.save(SystemPost.builder().postCode("leoeric1234").name("运营总监").status(Status.NORMAL).build());

    }
}
