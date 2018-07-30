package it.cercamister.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.cercamister.model.entity.AllenatoreEntity;

@Repository
public interface AllenatoreRepository extends JpaRepository<AllenatoreEntity, Long>  {
}
