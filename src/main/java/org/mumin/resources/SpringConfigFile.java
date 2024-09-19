package org.mumin.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {

  @Bean
  public DriverManagerDataSource myDataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3307/spring_jdbc_module_db");
    dataSource.setUsername("root");
    dataSource.setPassword("1234");
    return dataSource;
  }

  @Bean
  public JdbcTemplate myJdbcTemplate() {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    jdbcTemplate.setDataSource(myDataSource());

    return jdbcTemplate;
  }

}
