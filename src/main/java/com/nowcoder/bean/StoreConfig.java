package com.nowcoder.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yby on 2017/1/17.
 */
@Configuration
public class StoreConfig {



    @Bean
    public Store getStringStore(){
        return new StringStore();
    }
}
