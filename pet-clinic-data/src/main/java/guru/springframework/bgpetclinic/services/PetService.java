package guru.springframework.bgpetclinic.services;

import guru.springframework.bgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
