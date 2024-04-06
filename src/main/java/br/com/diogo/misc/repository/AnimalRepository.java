package br.com.diogo.misc.repository;

import br.com.diogo.misc.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
