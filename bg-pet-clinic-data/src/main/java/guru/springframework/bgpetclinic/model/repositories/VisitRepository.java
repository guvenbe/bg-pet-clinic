package guru.springframework.bgpetclinic.model.repositories;

import guru.springframework.bgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
