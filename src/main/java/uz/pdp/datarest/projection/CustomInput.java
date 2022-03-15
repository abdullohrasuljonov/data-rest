package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Currency;
import uz.pdp.datarest.entity.Input;
import uz.pdp.datarest.entity.Supplier;
import uz.pdp.datarest.entity.Warehouse;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
}
