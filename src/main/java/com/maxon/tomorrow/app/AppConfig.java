package com.maxon.tomorrow.app;

import com.maxon.tomorrow.service.api.ClientService;
import com.maxon.tomorrow.service.impl.ClientServiceImpl;
import org.h2.server.web.WebServlet;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author Maksym_Kotii
 */
@Configuration
@ComponentScan(basePackages={"com.maxon.tomorrow.controller"})
@PropertySource("classpath:application.properties")
@EntityScan("com.maxon.tomorrow.domain")
@EnableJpaRepositories("com.maxon.tomorrow.dao")
@Import(DatabaseConfig.class)
@EnableAutoConfiguration
public class AppConfig extends WebMvcConfigurerAdapter {
   
    // allows to add js css etc. 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/pages/**").addResourceLocations("/pages/");
    }
    
    @Bean
    public ClientService clientService (){
        return new ClientServiceImpl();
    }
    
    @Bean
public ServletRegistrationBean h2servletRegistration() {
    ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
    registration.addUrlMappings("/console/*");
    return registration;
}
    
    @Bean
    public InternalResourceViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        
        return resolver;
    }
    
}
