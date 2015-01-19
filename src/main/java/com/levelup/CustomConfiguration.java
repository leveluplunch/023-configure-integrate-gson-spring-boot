package com.levelup;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

@Configuration
public class CustomConfiguration {

	@Bean
    public HttpMessageConverters customConverters() {
		
		Collection<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
		
		GsonHttpMessageConverter gsonHttpMessageConverter = new GsonHttpMessageConverter();
		messageConverters.add(gsonHttpMessageConverter);
		
        return new HttpMessageConverters(true, messageConverters);
    }	
	
}
