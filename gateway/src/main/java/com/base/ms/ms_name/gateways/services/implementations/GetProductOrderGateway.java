package com.base.ms.ms_name.gateways.services.implementations;

import com.base.business.gateway.interfaces.IGetProductOrderGateway;

public class GetProductOrderGateway implements IGetProductOrderGateway {
    @Override
    public String callProductOrderGetwayAPI(String id) {
        return "call to external service";
    }
}
