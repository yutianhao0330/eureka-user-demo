package com.yutianhao.yutianhaouserprovider.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MP配置
 */
@EnableTransactionManagement//开启事务，不写默认也是开启的
@Configuration
@MapperScan("com.yutianhao.yutianhaouserprovider.mapper")
public class MyBatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}
