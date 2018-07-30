package it.cercamister.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_LICENZA")
public class TipoLicenzaEntity {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "LIC_CODICE")
	private String codiceTipoLicenza;
	
	@Column(name = "LIC_DESCRIZIONE")
	private String descrizioneTipoLicenza;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodiceTipoLicenza() {
		return codiceTipoLicenza;
	}

	public void setCodiceTipoLicenza(String codiceTipoLicenza) {
		this.codiceTipoLicenza = codiceTipoLicenza;
	}

	public String getDescrizioneTipoLicenza() {
		return descrizioneTipoLicenza;
	}

	public void setDescrizioneTipoLicenza(String descrizioneTipoLicenza) {
		this.descrizioneTipoLicenza = descrizioneTipoLicenza;
	}

	
	
}
