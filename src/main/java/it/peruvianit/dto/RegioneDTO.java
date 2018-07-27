
package it.peruvianit.dto;

import java.io.Serializable;

public class RegioneDTO implements Serializable {
	private static final long serialVersionUID = 1343099029434312311L;
	
	private String codiceRegione;
	private String descrizioneRegione;
	private String codiceAreaGeografica;
	private String codiceCit;
	private Integer codiceIstat;
	private String codiceRegioneNazionale;
	private String codiceRegioneIde;
	
	public String getCodiceRegione() {
		return codiceRegione;
	}
	public void setCodiceRegione(String codiceRegione) {
		this.codiceRegione = codiceRegione;
	}
	public String getDescrizioneRegione() {
		return descrizioneRegione;
	}
	public void setDescrizioneRegione(String descrizioneRegione) {
		this.descrizioneRegione = descrizioneRegione;
	}
	public String getCodiceAreaGeografica() {
		return codiceAreaGeografica;
	}
	public void setCodiceAreaGeografica(String codiceAreaGeografica) {
		this.codiceAreaGeografica = codiceAreaGeografica;
	}
	public String getCodiceCit() {
		return codiceCit;
	}
	public void setCodiceCit(String codiceCit) {
		this.codiceCit = codiceCit;
	}
	public Integer getCodiceIstat() {
		return codiceIstat;
	}
	public void setCodiceIstat(Integer codiceIstat) {
		this.codiceIstat = codiceIstat;
	}
	public String getCodiceRegioneNazionale() {
		return codiceRegioneNazionale;
	}
	public void setCodiceRegioneNazionale(String codiceRegioneNazionale) {
		this.codiceRegioneNazionale = codiceRegioneNazionale;
	}
	public String getCodiceRegioneIde() {
		return codiceRegioneIde;
	}
	public void setCodiceRegioneIde(String codiceRegioneIde) {
		this.codiceRegioneIde = codiceRegioneIde;
	}
}
