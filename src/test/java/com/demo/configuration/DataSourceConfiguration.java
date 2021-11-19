package com.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.utility.DockerImageName;

@Configuration
public class DataSourceConfiguration {

    @SuppressWarnings("rawtypes")
    @Bean(destroyMethod = "stop")
    public MySQLContainer mysqlContainer() {
        MySQLContainer mysql = new MySQLContainer(DockerImageName.parse("mysql").withTag("8.0.22"));
        mysql.start();
        return mysql;
    }
}