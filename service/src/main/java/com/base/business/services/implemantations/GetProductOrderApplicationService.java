package com.base.business.services.implemantations;

import com.base.business.services.interafaces.IGetProductOrderApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetProductOrderApplicationService implements IGetProductOrderApplicationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(GetProductOrderApplicationService.class);

   public String getProductOrderApplicationService(String id) {


       return "call gateway or "  + " call to persistence layer ";
   }
}
