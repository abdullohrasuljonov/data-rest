package uz.pdp.datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest.entity.User;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getCode();
    String getPassword();
    boolean getActive();
}
