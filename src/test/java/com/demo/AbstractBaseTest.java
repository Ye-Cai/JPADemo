package com.demo;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public abstract class AbstractBaseTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @BeforeEach
    void cleanData() {
        try {
            restartIdWith();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void restartIdWith() {
        List<String> tableNames = jdbcTemplate.queryForList("show tables", String.class);

        jdbcTemplate.execute("set FOREIGN_KEY_CHECKS = 0");
        tableNames.stream().filter(name -> !StringUtils.equals("flyway_schema_history", name)).forEach(
                tableName -> jdbcTemplate.execute("truncate table " + tableName)
        );
        jdbcTemplate.execute("SET FOREIGN_KEY_CHECKS = 1");
    }
}


