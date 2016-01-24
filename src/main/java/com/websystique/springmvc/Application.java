package com.websystique.springmvc;

import com.websystique.springmvc.configuration.Configuration;
import com.websystique.springmvc.converter.GoodsDataIdConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.spi.BackendIdConverter;
import org.springframework.plugin.core.OrderAwarePluginRegistry;
import org.springframework.plugin.core.PluginRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ansonliu on 2016/1/21.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
