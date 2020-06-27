package com.mglowinski.restaurants.config;

import ma.glasnost.orika.Converter;
import ma.glasnost.orika.Mapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class OrikaMapper extends ConfigurableMapper implements ApplicationContextAware {

	private MapperFactory factory;
	private ApplicationContext applicationContext;

	public OrikaMapper() {
		super(false);
	}

	@Override
	protected void configure(MapperFactory factory) {
		this.factory = factory;
		addMapperBeans();
		addConverterBeans();
	}

	@SuppressWarnings("rawtypes")
	private void addMapperBeans() {
		Map<String, Mapper> mappers = applicationContext.getBeansOfType(Mapper.class);
		mappers.values().forEach(this::addMapper);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void addMapper(Mapper<?, ?> mapper) {
		factory.classMap(mapper.getAType(), mapper.getBType())
				.byDefault()
				.customize((Mapper) mapper)
				.register();
	}

	@SuppressWarnings("rawtypes")
	private void addConverterBeans() {
		Map<String, Converter> mappers = applicationContext.getBeansOfType(Converter.class);
		mappers.values().forEach(this::addConverter);
	}

	private void addConverter(Converter<?, ?> converter) {
		factory.getConverterFactory().registerConverter(converter);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
		init();
	}

}
