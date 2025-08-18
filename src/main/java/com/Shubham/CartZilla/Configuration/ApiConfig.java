package com.Shubham.CartZilla.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
