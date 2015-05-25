/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxon.tomorrow.app;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Maksym_Kotii
 */
@EnableTransactionManagement
public class DatabaseConfig {

    @Value("${db.driver}")
    private String dbDriver;

    @Value("${db.file}")
    private String dbFile;	
	
    @Value("${db.password}")
    private String dbPass;
  
    @Value("${db.username}")
    private String dbUsername;

     @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dbDriver);
        dataSource.setUrl(dbFile);
        dataSource.setUsername(dbUsername);
        dataSource.setPassword(dbPass);
        return dataSource;
    }
    
//  public DataSource dataSource() {
//    DriverManagerDataSource dataSource = new DriverManagerDataSource();
//    dataSource.setDriverClassName(DB_DRIVER);
//    dataSource.setUrl(DB_URL);
//    dataSource.setUsername(DB_USERNAME);
//    dataSource.setPassword(DB_PASSWORD);
//    return dataSource;
//  }

}
