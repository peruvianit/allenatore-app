package it.peruvianit.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.peruvianit.model.entity.AllenatoreEntity;

@Repository
public interface AllenatoreRepository extends CrudRepository<AllenatoreEntity, Long>  {
}
