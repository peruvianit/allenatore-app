package it.peruvianit.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

public class TipoLicenzaDTO implements Serializable {
	private static final long serialVersionUID = -7498760841910052756L;

	@NotEmpty
	private Long progressivoTipoLicenza;
	
	private String nomeTipoLicenza;
	private String descrizioneTipoLicenza;
	
	public Long getProgressivoTipoLicenza() {
		return progressivoTipoLicenza;
	}
	public void setProgressivoTipoLicenza(Long progressivoTipoLicenza) {
		this.progressivoTipoLicenza = progressivoTipoLicenza;
	}
	public String getNomeTipoLicenza() {
		return nomeTipoLicenza;
	}
	public void setNomeTipoLicenza(String nomeTipoLicenza) {
		this.nomeTipoLicenza = nomeTipoLicenza;
	}
	public String getDescrizioneTipoLicenza() {
		return descrizioneTipoLicenza;
	}
	public void setDescrizioneTipoLicenza(String descrizioneTipoLicenza) {
		this.descrizioneTipoLicenza = descrizioneTipoLicenza;
	}
}
