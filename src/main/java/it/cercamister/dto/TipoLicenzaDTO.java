package it.cercamister.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class TipoLicenzaDTO implements Serializable {
	private static final long serialVersionUID = -7498760841910052756L;

	@NotNull
	private Long progressivoTipoLicenza;
	
	private String codiceTipoLicenza;
	private String descrizioneTipoLicenza;
	
	public Long getProgressivoTipoLicenza() {
		return progressivoTipoLicenza;
	}
	public void setProgressivoTipoLicenza(Long progressivoTipoLicenza) {
		this.progressivoTipoLicenza = progressivoTipoLicenza;
	}
	public String getCodiceTipoLicenza() {
		return codiceTipoLicenza;
	}
	public void setCodiceTipoLicenza(String nomeTipoLicenza) {
		this.codiceTipoLicenza = nomeTipoLicenza;
	}
	public String getDescrizioneTipoLicenza() {
		return descrizioneTipoLicenza;
	}
	public void setDescrizioneTipoLicenza(String descrizioneTipoLicenza) {
		this.descrizioneTipoLicenza = descrizioneTipoLicenza;
	}
}
