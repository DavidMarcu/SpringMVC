package com.springtutorial.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Bean
	public MessageSource messageSource(){
		ReloadableResourceBundleMessageSource resourceBundle = new ReloadableResourceBundleMessageSource();
		resourceBundle.setBasename("classpath:messages");
		resourceBundle.setDefaultEncoding("UTF-8");
		return resourceBundle;
	}

	public LocalValidatorFactoryBean validator(MessageSource messageSource){
		LocalValidatorFactoryBean validatorFactoryBean = new LocalValidatorFactoryBean();
		validatorFactoryBean.setValidationMessageSource(messageSource);
		return validatorFactoryBean;
	}
}
