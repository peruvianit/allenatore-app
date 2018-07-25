package it.peruvianit.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.peruvianit.model.entity.TipoLicenzaEntity;

@Repository
public interface TipoLicenzaRepository extends JpaRepository<TipoLicenzaEntity, Long>  {
}
