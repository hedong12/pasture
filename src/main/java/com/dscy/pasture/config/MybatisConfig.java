package com.dscy.pasture.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

    //注入配置定制器
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        //因为ConfigurationCustomizer是个接口，所以需要返回它的一个实现
        return new ConfigurationCustomizer(){
            @Override
            public void customize(org.apache.ibatis.session.Configuration
                                          configuration) {
                //开启驼峰命名映射
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }

}
