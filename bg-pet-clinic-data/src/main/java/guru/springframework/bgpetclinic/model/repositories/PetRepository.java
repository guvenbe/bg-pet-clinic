package guru.springframework.bgpetclinic.model.repositories;

import guru.springframework.bgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
