package it.peruvianit.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ALLENATORE")
public class AllenatoreEntity {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "LIC_ID")
	private Long licId;
	
	@Column(name = "ALL_NOME")
	private String allNome;
	
	@Column(name = "ALL_COGNOME")
	private String allCognome;
	
	@Column(name = "ALL_NAZIONE")
	private String allNazione;
	
	@Column(name = "ALL_CITTA")
	private String allCitta;

	@Column(name = "ALL_INDIRIZZO")
	private String allIndirizzo;
	
	@Column(name = "ALL_EMAIL")
	private String allEmail;
	
	@Column(name = "ALL_TELEFONO")
	private String allTelefono;
	
	@Column(name = "ALL_FLAG_TRASFERTA_CITTA")
	private String allFlagTrasfertaCitta;
	
	@Column(name = "ALL_FLAG_TRASFERTA_NAZIONE")
	private String allFlagTrasfertaNazione;
	
	@Column(name = "ALL_FLAG_TRASFERTA_CONTINENTE")
	private String allFlagTrasfertaContinente;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALL_DATA_REGISTRAZIONE", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=false)
	private Date allDataRegistrazione;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLicId() {
		return licId;
	}

	public void setLicId(Long licId) {
		this.licId = licId;
	}

	public String getAllNome() {
		return allNome;
	}

	public void setAllNome(String allNome) {
		this.allNome = allNome;
	}

	public String getAllCognome() {
		return allCognome;
	}

	public void setAllCognome(String allCognome) {
		this.allCognome = allCognome;
	}

	public String getAllNazione() {
		return allNazione;
	}

	public void setAllNazione(String allNazione) {
		this.allNazione = allNazione;
	}

	public String getAllCitta() {
		return allCitta;
	}

	public void setAllCitta(String allCitta) {
		this.allCitta = allCitta;
	}

	public String getAllIndirizzo() {
		return allIndirizzo;
	}

	public void setAllIndirizzo(String allIndirizzo) {
		this.allIndirizzo = allIndirizzo;
	}

	public String getAllEmail() {
		return allEmail;
	}

	public void setAllEmail(String allEmail) {
		this.allEmail = allEmail;
	}

	public String getAllTelefono() {
		return allTelefono;
	}

	public void setAllTelefono(String allTelefono) {
		this.allTelefono = allTelefono;
	}

	public String getAllFlagTrasfertaCitta() {
		return allFlagTrasfertaCitta;
	}

	public void setAllFlagTrasfertaCitta(String allFlagTrasfertaCitta) {
		this.allFlagTrasfertaCitta = allFlagTrasfertaCitta;
	}

	public String getAllFlagTrasfertaNazione() {
		return allFlagTrasfertaNazione;
	}

	public void setAllFlagTrasfertaNazione(String allFlagTrasfertaNazione) {
		this.allFlagTrasfertaNazione = allFlagTrasfertaNazione;
	}

	public String getAllFlagTrasfertaContinente() {
		return allFlagTrasfertaContinente;
	}

	public void setAllFlagTrasfertaContinente(String allFlagTrasfertaContinente) {
		this.allFlagTrasfertaContinente = allFlagTrasfertaContinente;
	}

	public Date getAllDataRegistrazione() {
		return allDataRegistrazione;
	}

	public void setAllDataRegistrazione(Date allDataRegistrazione) {
		this.allDataRegistrazione = allDataRegistrazione;
	}
}
