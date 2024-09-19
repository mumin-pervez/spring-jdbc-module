package org.mumin;

import org.mumin.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    //System.out.println("Hello World!");
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

    /*--------------------- Insert Operation -------------------*/
    int empId = 23;
    String empName = "Abida Khatun";
    String empDesignation = "Receptionist";

    String insert_sql_query = "INSERT INTO employee VALUE(?, ?, ?)";
    int count = jdbcTemplate.update(insert_sql_query, empId, empName, empDesignation);
    if (count > 0) {
      System.out.println("Data is Inserted");
    } else {
      System.out.println("Data is Not Inserted");
    }


  }
}
