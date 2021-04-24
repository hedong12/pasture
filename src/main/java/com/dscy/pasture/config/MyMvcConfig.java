package com.dscy.pasture.config;

import com.dscy.pasture.intercetor.AdminLoginIntercetor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    //增加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //增加自定义登录拦截器
        registry.addInterceptor(new AdminLoginIntercetor())
                .addPathPatterns("/**")  //拦截任意多重路径下的任意请求
                .excludePathPatterns("/admin", "/","/admin/toregister","/admin/toadmin") //排除拦截
                .excludePathPatterns("/assets/**", "/css/**","/uploaded/**", "/images/**", "/js/**", "/register/**")//排除对静态资源拦截
                .excludePathPatterns("/admin/login");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("adminLogin");
        registry.addViewController("/admin").setViewName("adminLogin");
        registry.addViewController("/admin/").setViewName("adminLogin");
        registry.addViewController("/toadmin").setViewName("adminLogin");
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/uploaded/**").
                addResourceLocations("file:D:\\Code-idea-projects\\54\\springboot-project\\PASTURE\\src\\main\\resources\\static\\uploaded\\");
    }


}
