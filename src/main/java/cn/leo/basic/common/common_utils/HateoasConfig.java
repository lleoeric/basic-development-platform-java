package cn.leo.basic.common.common_utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.mediatype.hal.Jackson2HalModule;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * @Configuration类将注册Jackson2HalModule，这是Spring HATEOAS提供的Jackson模块，用于支持HAL（Hypertext Application Language）格式。它还配置了一个MappingJackson2HttpMessageConverter，用于将Java对象序列化为JSON格式的响应
 */
@Configuration
@EnableWebMvc
@EnableHypermediaSupport(type = {})
public class HateoasConfig extends WebMvcConfigurationSupport {
    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter(halObjectMapper()));
        super.configureMessageConverters(converters);
    }
    @Bean
    public ObjectMapper halObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Jackson2HalModule());
        return objectMapper;
    }
}
