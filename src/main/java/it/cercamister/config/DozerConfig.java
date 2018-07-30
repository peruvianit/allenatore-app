package it.cercamister.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerConfig {
	
	@Bean
	public DozerBeanMapper mapper() throws Exception {
	    DozerBeanMapper mapper = new DozerBeanMapper();
	    DozerMapping my = new DozerMapping();
	    mapper.addMapping(my);
	    return mapper;
	}
	
}