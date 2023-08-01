package org.example.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import javax.sql.DataSource;

@Configuration
public class databsaseHelper {

    @Value("${databaseurl}")
    String dataBaseUrl;
    @Value("${databasepassword}")
    String dataBasepassword;
    @Value("${databaseusername}")
    String dataBaseUsername;
    @Value("${databasedriver}")
    String dataBasedriver;

    @Bean
    public DataSource getInstanceDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(dataBaseUrl);
        dataSource.setUsername(dataBaseUsername);
        dataSource.setPassword(dataBasepassword);
        dataSource.setDriverClassName(dataBasedriver);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplateImpl() {
        return new JdbcTemplate(getInstanceDataSource());
    }
}
