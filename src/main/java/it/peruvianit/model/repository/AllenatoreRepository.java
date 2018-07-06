package it.peruvianit.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.peruvianit.model.entity.AllenatoreEntity;

@Repository
public interface AllenatoreRepository extends JpaRepository<AllenatoreEntity, Long>  {
}
