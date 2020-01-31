package com.springmvc.demo.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration // <tx:annotation-driven>
@PropertySource("classpath:log4jdbc.log4j2.properties")
@EnableTransactionManagement
public class DBConfig {
//	@Value("${log4jdbc.spylogdelegator.name}")
//	private String log4jdbc;
	// 데이터소스 등록
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		
		BasicDataSource dataSource = new BasicDataSource();
//		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
//		dataSource.setUrl("jdbc:mariadb://127.0.0.1:3306/test");
		dataSource.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		dataSource.setUrl("jdbc:log4jdbc:mariadb://127.0.0.1:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setDefaultAutoCommit(false);
		return dataSource;
	}

//	@Bean
//	public Log4j2SpyLogDelegator dataSourceLog(DataSource dataSource) {
//		Log4jdbcCustomFormatter formatter = new Log4jdbcCustomFormatter();
//		formatter.setLoggingType(LoggingType.MULTI_LINE);
//		formatter.setSqlPrefix("SQL        : \n");
//		Log4j2SpyLogDelegator dSource = new Log4j2SpyLogDelegator(dataSource);
//		return dSource;
//	}

	// 트랜잭션 매니저 등록
	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

}
