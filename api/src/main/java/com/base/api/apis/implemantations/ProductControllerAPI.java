package com.base.api.apis.implemantations;




import com.base.api.apis.interfaces.IProductControllerAPI;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerAPI implements IProductControllerAPI {

    IGetProductDelegate getProductDelegate;

    public String getProduct( String id) {
        return getProductDelegate.excute(id);
    }

    public interface IGetProductDelegate {
        public String excute(String id);
    }

    @AutoConfiguration
    public class GetProductConfig {
        public GetProductConfig() {
        }
    }

}