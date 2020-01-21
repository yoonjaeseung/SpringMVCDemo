package com.springmvc.demo.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration // <tx:annotation-driven>
@EnableTransactionManagement
public class DBConfig {

	// 데이터소스 등록
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		dataSource.setUrl("jdbc:mariadb://127.0.0.1:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setDefaultAutoCommit(false);
		return dataSource;
	}

	// 트랜잭션 매니저 등록
	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

}
