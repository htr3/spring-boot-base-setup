package com.base.ms_name.resources.delegates;

import com.base.api.apis.implemantations.ProductControllerAPI;
import com.base.api.apis.interfaces.IProductControllerAPI;
import com.base.business.services.interafaces.IGetProductOrderApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public class GetProductOrderDelegate implements ProductControllerAPI.IGetProductDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(GetProductOrderDelegate.class);

    @Inject
    private IGetProductOrderApplicationService getProductOrderApplicationService;

    public String excute(String productOrder) {

        return getProductOrderApplicationService.getProductOrderApplicationService(productOrder);
    }

}
