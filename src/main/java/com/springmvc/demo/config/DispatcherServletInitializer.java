package com.springmvc.demo.config;

import javax.servlet.Filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//WebApplicationInitializer 부분은 web.xml에 정의되는 spring configuration 부분을 대체해주는 역할
//위의 class를 방식보다 더 간결하게 사용할 수 있는 AbstractAnnotationConfigDispatcherServletInitializer
public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	private static final Logger logger = LoggerFactory.getLogger(DispatcherServletInitializer.class);

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		log.info("=======getRootConfigClasses=======");
		return new Class[] { AppConfig.class, DBConfig.class, MybatisConfig.class };

	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		logger.info("============getServletConfigClasses============");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() {

		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");

		return new Filter[] { characterEncodingFilter };

	}
}