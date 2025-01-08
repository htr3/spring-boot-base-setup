package com.base.ms_name.resources.delegates;

import com.base.api.apis.implemantations.ProductController;
import com.base.api.apis.interfaces.IProductControllerAPI;
import com.base.business.services.interafaces.IGetProductOrderApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class GetProductOrderDelegate implements ProductController.IGetProductDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(GetProductOrderDelegate.class);

    @Inject
    private IGetProductOrderApplicationService getProductOrderApplicationService;

    public String execute(ProductController.ProductParameters parameters) {
        return getProductOrderApplicationService.getProductOrderApplicationService(null);
    }
}