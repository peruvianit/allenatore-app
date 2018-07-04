package it.peruvianit.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class AllenatoreDTO implements Serializable {
	private static final long serialVersionUID = 4815113711689913021L;

	private Long progressivoAllenatore;
	
	@Valid
	private TipoLicenzaDTO tipoLicenzaDTO;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String cognome;
	
	private String nazione;
	private String citta;
	private String descrizioneIndirizzo;
	
	@Email
	private String email;
	private String telefono;
	private String flgaSpostaCitta;
	private String flgaSpostaNazione;
	private String flgaSpostaContinente;
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
	public String getFlgaSpostaCitta() {
		return flgaSpostaCitta;
	}
	public void setFlgaSpostaCitta(String flgaSpostaCitta) {
		this.flgaSpostaCitta = flgaSpostaCitta;
	}
	public String getFlgaSpostaNazione() {
		return flgaSpostaNazione;
	}
	public void setFlgaSpostaNazione(String flgaSpostaNazione) {
		this.flgaSpostaNazione = flgaSpostaNazione;
	}
	public String getFlgaSpostaContinente() {
		return flgaSpostaContinente;
	}
	public void setFlgaSpostaContinente(String flgaSpostaContinente) {
		this.flgaSpostaContinente = flgaSpostaContinente;
	}
	public Date getDataRegistrazione() {
		return dataRegistrazione;
	}
	public void setDataRegistrazione(Date dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}
}
