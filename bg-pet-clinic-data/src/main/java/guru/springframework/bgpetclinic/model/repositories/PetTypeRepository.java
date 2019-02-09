package guru.springframework.bgpetclinic.model.repositories;

import guru.springframework.bgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
