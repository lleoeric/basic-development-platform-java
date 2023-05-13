package cn.leo.basic.common.common_utils;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.Objects;

@Configuration
public class DataSourceConfig{

    @Autowired
    private Environment environment;
    /*@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("app.datasource.driverClassName")));
        dataSource.setUrl(environment.getProperty("app.datasource.url"));
        dataSource.setUsername(environment.getProperty("app.datasource.username"));
        dataSource.setPassword(environment.getProperty("app.datasource.password"));
        return dataSource;
    }*/

}
