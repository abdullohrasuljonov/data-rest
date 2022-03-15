package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Client;
import uz.pdp.datarest.entity.Currency;
import uz.pdp.datarest.entity.Output;
import uz.pdp.datarest.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
    Client getClient();
}
