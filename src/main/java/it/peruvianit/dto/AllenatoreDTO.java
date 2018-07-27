
package it.peruvianit.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value ="AllenatoreDTO")
public class AllenatoreDTO implements Serializable {
	private static final long serialVersionUID = 4815113711689913021L;

	@ApiModelProperty(notes = "Numero identificativo del allenatore")
	private Long progressivoAllenatore;
	
	@Valid
	@ApiModelProperty(notes = "Tipologia licenza")
	private TipoLicenzaDTO tipoLicenzaDTO;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String cognome;

	@ApiModelProperty(notes = "Nazione da residenza")
	private String nazione;
	@ApiModelProperty(notes = "Citta da residenza")
	private String citta;
	@ApiModelProperty(notes = "Indirizzo residenza")
	private String descrizioneIndirizzo;
	
	@Email
	private String email;
	private String telefono;
	
	@ApiModelProperty(notes = "Posibilita di spostamento Citta")
	private String flagSpostaCitta;
	@ApiModelProperty(notes = "Posibilita di spostamento Nazione")
	private String flagSpostaNazione;
	@ApiModelProperty(notes = "Posibilita di spostamento Continente")
	private String flagSpostaContinente;
	@ApiModelProperty(notes = "Data de registrazione")
	private Date dataRegistrazione;
	
	public Long getProgressivoAllenatore() {
		return progressivoAllenatore;
	}
	public void setProgressivoAllenatore(Long progressivoAllenatore) {
		this.progressivoAllenatore = progressivoAllenatore;
	}
	public TipoLicenzaDTO getTipoLicenzaDTO() {
		return tipoLicenzaDTO;
	}
	public void setTipoLicenzaDTO(TipoLicenzaDTO tipoLicenzaDTO) {
		this.tipoLicenzaDTO = tipoLicenzaDTO;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNazione() {
		return nazione;
	}
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getDescrizioneIndirizzo() {
		return descrizioneIndirizzo;
	}
	public void setDescrizioneIndirizzo(String descrizioneIndirizzo) {
		this.descrizioneIndirizzo = descrizioneIndirizzo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFlagSpostaCitta() {
		return flagSpostaCitta;
	}
	public void setFlagSpostaCitta(String flagSpostaCitta) {
		this.flagSpostaCitta = flagSpostaCitta;
	}
	public String getFlagSpostaNazione() {
		return flagSpostaNazione;
	}
	public void setFlagSpostaNazione(String flagSpostaNazione) {
		this.flagSpostaNazione = flagSpostaNazione;
	}
	public String getFlagSpostaContinente() {
		return flagSpostaContinente;
	}
	public void setFlagSpostaContinente(String flagSpostaContinente) {
		this.flagSpostaContinente = flagSpostaContinente;
	}
	public Date getDataRegistrazione() {
		return dataRegistrazione;
	}
	public void setDataRegistrazione(Date dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}
}
