package com.base.api.apis.implemantations;


import com.base.api.apis.interfaces.IProductControllerAPI;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@Controller
@Scope(value = "prototype")
public class ProductController implements IProductControllerAPI, ApplicationContextAware {

    @Inject
    protected HttpServletRequest httpServletRequest;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static class ProductParameters {
        private String id;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    @AutoConfiguration
    public class ProductControllerConfig {
        @Bean
        @Scope(value = "prototype")
        public ProductController.ProductParameters getBeanProductParameters() {
            return new ProductController.ProductParameters();
        }
    }

    public interface IGetProductDelegate {
        public String execute(ProductController.ProductParameters parameters);
    }

    @Override
    @GetMapping("/{id}")
    public String getProduct( @PathVariable("id") String id) {
        ProductController.IGetProductDelegate delegate = this.applicationContext.getBean(ProductController.IGetProductDelegate.class);
        ProductController.ProductParameters parameters = this.applicationContext.getBean(ProductController.ProductParameters.class);
        parameters.setId(id);
        return delegate.execute(parameters);
    }
}