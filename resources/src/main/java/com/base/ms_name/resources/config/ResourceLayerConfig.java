package com.base.ms_name.resources.config;


import com.base.api.apis.implemantations.ProductController;
import com.base.ms_name.resources.delegates.GetProductOrderDelegate;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@ComponentScan(basePackages = "com.base.ms_name.resources.delegates")
public class ResourceLayerConfig {

    @Bean
    public ProductController.IGetProductDelegate getProductAPI() {
        return new GetProductOrderDelegate();
    }
}
