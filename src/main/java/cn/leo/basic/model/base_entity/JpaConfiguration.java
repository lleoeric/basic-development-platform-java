package cn.leo.basic.model.base_entity;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@Configuration
public class JpaConfiguration {
    /**
     * 加载审计功能
     */
    @Bean
    @ConditionalOnMissingBean(name = "myAuditionAware")
    MyAuditorAware myAuditorAware() {
        return new MyAuditorAware();
    }
}
