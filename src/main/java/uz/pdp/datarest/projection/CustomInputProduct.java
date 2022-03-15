package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Input;
import uz.pdp.datarest.entity.InputProduct;
import uz.pdp.datarest.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Date getExpireDate();
    Input getInput();
}
