package com.liceu.demospringjdbc.config;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigJDBC {
    @Autowired
    Environment env;

    @Bean
    public DataSource dataSource() {
        MysqlDataSource mds = new MysqlDataSource();
        mds.setURL(env.getProperty("jdbc.url"));
        mds.setUser(env.getProperty("jdbc.user"));
        mds.setPassword(env.getProperty("jdbc.password"));
        return mds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
