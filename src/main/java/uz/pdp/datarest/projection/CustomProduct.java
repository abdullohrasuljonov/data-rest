package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Category;
import uz.pdp.datarest.entity.Measurement;
import uz.pdp.datarest.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();
    String getName();
    boolean getActive();
    String getCode();
    Category getCategory();
    Measurement getMeasurement();
}
