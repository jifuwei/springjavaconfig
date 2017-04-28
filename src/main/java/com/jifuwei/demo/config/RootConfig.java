package com.jifuwei.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

/**
 * Root WebApplicationContext config
 * Created by JFW on 2017/4/28.
 */
@Configuration
@ComponentScan(basePackages = {"com.jifuwei.demo"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class, RestController.class, ControllerAdvice.class})})
@Import({DatasourceConfig.class})
public class RootConfig {

}
