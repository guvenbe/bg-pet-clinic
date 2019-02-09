package guru.springframework.bgpetclinic.model.repositories;

import guru.springframework.bgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
