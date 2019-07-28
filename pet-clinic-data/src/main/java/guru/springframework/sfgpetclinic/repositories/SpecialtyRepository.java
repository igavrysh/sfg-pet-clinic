package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.CrudService;

public interface SpecialtyRepository extends CrudService<PetType, Long> {
}
