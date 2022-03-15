package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Integer getId();
    String getName();
    String getPhoneNumber();
    boolean getActive();
}
