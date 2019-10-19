package com.frozenfire.dyncsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.frozenfire.dyncsource")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) // 禁用数据源自动配置
public class DyncsourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DyncsourceApplication.class, args);
    }

}
