package com.cat.config;

import com.dianping.cat.servlet.CatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Description: CatFilterConfigure
 * @Author: wutuo
 * @Date: 2021-07-14
 * @Version:v1.0
 */
@Component
public class CatFilterConfigure {
    @Bean
    public FilterRegistrationBean  catFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        CatFilter filter = new CatFilter();
        registrationBean.setFilter(filter);
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("my-cat-filter");
        registrationBean.setOrder(1);
        return registrationBean;
    }
}

