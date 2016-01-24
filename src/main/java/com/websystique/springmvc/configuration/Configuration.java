package com.websystique.springmvc.configuration;

import org.springframework.boot.autoconfigure.data.rest.SpringBootRepositoryRestMvcConfiguration;
import com.websystique.springmvc.converter.GoodsDataIdConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.data.rest.webmvc.spi.BackendIdConverter;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.plugin.core.OrderAwarePluginRegistry;
import org.springframework.plugin.core.PluginRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ansonliu on 2016/1/24.
 */
@org.springframework.context.annotation.Configuration
public class Configuration extends SpringBootRepositoryRestMvcConfiguration {

    @Override
    @Bean
    public PluginRegistry<BackendIdConverter, Class<?>> backendIdConverterRegistry() {

        List<BackendIdConverter> converters = new ArrayList<BackendIdConverter>(1);
        converters.add(new GoodsDataIdConverter());

        return OrderAwarePluginRegistry.create(converters);
    }
}
