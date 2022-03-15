package uz.pdp.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarest.entity.Input;
import uz.pdp.datarest.projection.CustomInput;

@RepositoryRestResource(path = "input",collectionResourceRel = "list",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input,Integer> {
}
