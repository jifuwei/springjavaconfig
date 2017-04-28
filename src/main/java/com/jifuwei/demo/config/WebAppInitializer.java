package com.jifuwei.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * equal web.xml config SpringMVC
 * Created by JFW on 2017/4/28.
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * expect webApp need beans, for example: datasource, transaction...
     * @return
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * webApp applicationContext all can use beans
     * @return
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebMvcConfig.class};
    }

    /**
     * dispatch all request
     * @return
     */
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
