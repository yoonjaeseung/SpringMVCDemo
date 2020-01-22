package com.springmvc.demo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Configuration
@MapperScan(basePackages = { "com.springmvc.demo.mapper" })
public class MybatisConfig {

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		log.info("=======SqlSessionFactory=======");
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setTypeAliasesPackage("com.springmvc.demo.model");
//		factoryBean.setConfigLocation(dbconfig.getResource("classpath:/mybatis/mybatis-config.xml"));
//		factoryBean.setMapperLocations(dbconfig.getResources("classpath:/mybatis/mappers/*.xml"));
		return factoryBean.getObject();

	}

	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		log.info("=======SqlSessionTemplate=======");
		return new SqlSessionTemplate(sqlSessionFactory);

	}

}
