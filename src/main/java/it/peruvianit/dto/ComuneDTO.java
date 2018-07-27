
package it.peruvianit.dto;

import java.io.Serializable;

public class ComuneDTO implements Serializable {
	private static final long serialVersionUID = 5990535931445398812L;

	private String codiceComune;
	private String codiceProvincia;
	private String descrizioneComune;
	private String codiceCap;
	private String flagProvincia;
	private String codiceCatComune;
	private Integer flagStaComune;
	private Integer codiceIstat;
	private String codiceProvinciaNis;
	private String istatAlfa;
	private Integer istatNum;
	private Integer istat103;
	private Integer istat107;
	private String codiceRegioneNazionale;
	private Integer istat110;
	
	private ProvinciaDTO provinciaDTO;
	
	public String getCodiceComune() {
		return codiceComune;
	}
	public void setCodiceComune(String codiceComune) {
		this.codiceComune = codiceComune;
	}
	public String getCodiceProvincia() {
		return codiceProvincia;
	}
	public void setCodiceProvincia(String codiceProvincia) {
		this.codiceProvincia = codiceProvincia;
	}
	public String getDescrizioneComune() {
		return descrizioneComune;
	}
	public void setDescrizioneComune(String descrizioneComune) {
		this.descrizioneComune = descrizioneComune;
	}
	public String getCodiceCap() {
		return codiceCap;
	}
	public void setCodiceCap(String codiceCap) {
		this.codiceCap = codiceCap;
	}
	public String getFlagProvincia() {
		return flagProvincia;
	}
	public void setFlagProvincia(String flagProvincia) {
		this.flagProvincia = flagProvincia;
	}
	public String getCodiceCatComune() {
		return codiceCatComune;
	}
	public void setCodiceCatComune(String codiceCatComune) {
		this.codiceCatComune = codiceCatComune;
	}
	public Integer getFlagStaComune() {
		return flagStaComune;
	}
	public void setFlagStaComune(Integer flagStaComune) {
		this.flagStaComune = flagStaComune;
	}
	public Integer getCodiceIstat() {
		return codiceIstat;
	}
	public void setCodiceIstat(Integer codiceIstat) {
		this.codiceIstat = codiceIstat;
	}
	public String getCodiceProvinciaNis() {
		return codiceProvinciaNis;
	}
	public void setCodiceProvinciaNis(String codiceProvinciaNis) {
		this.codiceProvinciaNis = codiceProvinciaNis;
	}
	public String getIstatAlfa() {
		return istatAlfa;
	}
	public void setIstatAlfa(String istatAlfa) {
		this.istatAlfa = istatAlfa;
	}
	public Integer getIstatNum() {
		return istatNum;
	}
	public void setIstatNum(Integer istatNum) {
		this.istatNum = istatNum;
	}
	public Integer getIstat103() {
		return istat103;
	}
	public void setIstat103(Integer istat103) {
		this.istat103 = istat103;
	}
	public Integer getIstat107() {
		return istat107;
	}
	public void setIstat107(Integer istat107) {
		this.istat107 = istat107;
	}
	public String getCodiceRegioneNazionale() {
		return codiceRegioneNazionale;
	}
	public void setCodiceRegioneNazionale(String codiceRegioneNazionale) {
		this.codiceRegioneNazionale = codiceRegioneNazionale;
	}
	public Integer getIstat110() {
		return istat110;
	}
	public void setIstat110(Integer istat110) {
		this.istat110 = istat110;
	}
	public ProvinciaDTO getProvinciaDTO() {
		return provinciaDTO;
	}
	public void setProvinciaDTO(ProvinciaDTO provinciaDTO) {
		this.provinciaDTO = provinciaDTO;
	}
}
