package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {

    Integer getId();
    String getName();
    boolean getActive();
}
