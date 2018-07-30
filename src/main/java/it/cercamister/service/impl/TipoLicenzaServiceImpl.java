package it.cercamister.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import it.cercamister.dto.TipoLicenzaDTO;
import it.cercamister.model.entity.TipoLicenzaEntity;
import it.cercamister.model.repository.TipoLicenzaRepository;
import it.cercamister.service.ITipoLicenzaService;

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
