package com.base.ms_name.resources.config;


import com.base.api.apis.implemantations.ProductControllerAPI;
import com.base.ms_name.resources.delegates.GetProductOrderDelegate;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class ResourceLayerConfig {

    @Bean
    public ProductControllerAPI.IGetProductDelegate  getProductResource() {
        return new GetProductOrderDelegate();
    }

}
