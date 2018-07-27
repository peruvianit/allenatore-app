
package it.peruvianit.dto;

import java.io.Serializable;

public class ProvinciaDTO implements Serializable {
	private static final long serialVersionUID = -9025786976255637585L;
	
	private String codiceProvincia;
	private String codiceRegione;
	private String descrizioneProvincia;
	private String flagCapProvincia;
	private Integer codiceIstat;
	
	private RegioneDTO regioneDTO;
	
	public String getCodiceProvincia() {
		return codiceProvincia;
	}
	public void setCodiceProvincia(String codiceProvincia) {
		this.codiceProvincia = codiceProvincia;
	}
	public String getCodiceRegione() {
		return codiceRegione;
	}
	public void setCodiceRegione(String codiceRegione) {
		this.codiceRegione = codiceRegione;
	}
	public String getDescrizioneProvincia() {
		return descrizioneProvincia;
	}
	public void setDescrizioneProvincia(String descrizioneProvincia) {
		this.descrizioneProvincia = descrizioneProvincia;
	}
	public String getFlagCapProvincia() {
		return flagCapProvincia;
	}
	public void setFlagCapProvincia(String flagCapProvincia) {
		this.flagCapProvincia = flagCapProvincia;
	}
	public Integer getCodiceIstat() {
		return codiceIstat;
	}
	public void setCodiceIstat(Integer codiceIstat) {
		this.codiceIstat = codiceIstat;
	}
	public RegioneDTO getRegioneDTO() {
		return regioneDTO;
	}
	public void setRegioneDTO(RegioneDTO regioneDTO) {
		this.regioneDTO = regioneDTO;
	}
}
