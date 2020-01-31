package com.springmvc.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//configuration class는 spring-servlet.xml 포함하고 있는 정보를 대체해 줄 수있는 자바소스
@Configuration // @Bean으로 된 하나 이상의 bean methods를 스프링 컨테이너에 의해 관리받는 곳
@EnableWebMvc // mvc:annotation-driven in XML :@Controller anotation을 지원할 수 있게 해줌
@ComponentScan(basePackages = { "com.springmvc.demo" }) // context:component-scan 대신 사용. filter도 지정할 수 있음
public class AppConfig {

	@Bean
	public InternalResourceViewResolver resolver() {
		log.info("=======InternalResourceViewResolver=======");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}

//@ComponentScan(basePackages = "com.springmvc.demo.*", excludeFilters = @ComponentScan.Filter(Configuration.class))
//public class AppConfig extends WebMvcConfigurerAdapter { // 인터셉터를 추가하기 위해 WebMvcConfigurerAdapter 를 상속한다
//	@Bean
//	public ViewResolver viewResolver() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/WEB-INF/views/");
//		resolver.setSuffix(".jsp");
//		return resolver;
//	}
//
//	/** * 인터셉터 추가 */
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(new CorsInterceptor());
//	}
//}
