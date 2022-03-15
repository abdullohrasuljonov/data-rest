package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {

    Integer getId();
    String getName();
    String getPhoneNumber();


}
