package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author Mendy
 * @create 2023-06-24 13:57
 */
public class JdbcConfig {
        @Value("${jdbc.driver}")
        private String driver;

        @Value("${jdbc.url}")
        private String url;

        @Value("${jdbc.username}")
        private String userName;

        @Value("${jdbc.password}")
        private String password;


        //1. define a meethod to manage the object
        //2. Use @Bean, it means that the current method's return value is a bean
        @Bean
        public DataSource dataSource(){
            DruidDataSource ds = new DruidDataSource();
            ds.setDriverClassName(driver);
            ds.setUrl(url);
            ds.setUsername(userName);
            ds.setPassword(password);
            return ds;
        }

}
