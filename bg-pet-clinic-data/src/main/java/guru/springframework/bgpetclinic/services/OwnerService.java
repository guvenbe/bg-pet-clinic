package guru.springframework.bgpetclinic.services;

import guru.springframework.bgpetclinic.model.Owner;



public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
