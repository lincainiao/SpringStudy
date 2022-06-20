package com.lin.utils;

import com.lin.pojo.Girls;
import com.lin.pojo.Occupation;
import com.lin.pojo.Uniform;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
public class GirlsConfig {
    @Bean
    public Occupation getOccupation(){
        return new Occupation();
    }

    @Bean Uniform getUniform(){
        return new Uniform();
    }

    @Bean
    public Girls getGirls(){
        Girls girls = new Girls();
        girls.setOccupation(getOccupation());
        girls.setUniform(getUniform());
        return girls;
    }
}
