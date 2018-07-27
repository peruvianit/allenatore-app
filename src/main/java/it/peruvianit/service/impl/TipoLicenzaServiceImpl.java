package it.peruvianit.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import it.peruvianit.dto.TipoLicenzaDTO;
import it.peruvianit.model.entity.TipoLicenzaEntity;
import it.peruvianit.model.repository.TipoLicenzaRepository;
import it.peruvianit.service.ITipoLicenzaService;

@Service
public class TipoLicenzaServiceImpl implements ITipoLicenzaService{

	@Autowired
	private TipoLicenzaRepository tipoLicenzaRepository;
	@Autowired
	private DozerBeanMapper rdDozerMapper;
	@Override
	public List<TipoLicenzaDTO> listaTipoLicenze() {
		List<TipoLicenzaEntity> listTipoLicenzaEntity = tipoLicenzaRepository.findAll(new Sort(Direction.ASC,"descrizioneTipoLicenza") );
		List<TipoLicenzaDTO> targets = new ArrayList<TipoLicenzaDTO>();
		for (TipoLicenzaEntity tipoLicenzaEntity : listTipoLicenzaEntity) {
    		targets.add(rdDozerMapper.map(tipoLicenzaEntity, TipoLicenzaDTO.class));
		}
		return targets;
	}
	

	
	

	
}
