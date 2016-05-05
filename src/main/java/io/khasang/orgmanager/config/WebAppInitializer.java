package io.khasang.orgmanager.config;

import io.khasang.orgmanager.config.application.RootConfig;
import io.khasang.orgmanager.config.application.WebConfig;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        Filter[] filters;
        CharacterEncodingFilter encFilter = new CharacterEncodingFilter();
        encFilter.setEncoding("UTF-8");
        encFilter.setForceEncoding(true);
        filters = new Filter[] {encFilter};
        return filters;
    }
}
