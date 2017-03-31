package com.hemendra.learning.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import com.hemendra.learning.annotation.tilesconfig.TilesDefinitionsConfig;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.hemendra.learning.annotation.controller", "com.hemendra.learning.annotation.restcontroller", "com.hemendra.learning"})
public class AppConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
		resourceViewResolver.setViewClass(JstlView.class);
		resourceViewResolver.setPrefix("/WEB-INF/views/");
		resourceViewResolver.setSuffix(".jsp");
		resourceViewResolver.setOrder(3);
		return resourceViewResolver;
	}
	
	/*
	 * Configure Tiles View Resolver
	 */
	@Bean
	public TilesConfigurer getTilesConfigurer(){
		TilesConfigurer configurer = new TilesConfigurer();
		configurer.setCheckRefresh(true);
		//configurer.setDefinitions(new String[]{"/WEB-INF/views/**/tiles.xml"}); // It is required when you want to use a 'tiles.xml' file for tile configuration
		//When you specify '/WEB-INF/views/**/tiles.xml', you are telling the TilesConfigurer to look 
		//for all tiles definitions recursively under the /Web-INF/views directory.
		
		
		//Tiles Java based definition configuratin
		configurer.setDefinitionsFactoryClass(TilesDefinitionsConfig.class);
		
		return configurer;
	}
	
	@Bean
	public TilesViewResolver getTilesViewResolver(){
		TilesViewResolver tilesViewResolver = new TilesViewResolver();
		tilesViewResolver.setViewClass(TilesView.class);
		tilesViewResolver.setOrder(1); //it means TilesViewResolver is first going to show
		return tilesViewResolver;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable(); // Says that Spring will not handle the static contents like js, html or css files
	}
	
	

}
