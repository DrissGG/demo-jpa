/**
 * 
 */
package fr.diginamic;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author driss
 *
 */
@Entity
public class Emprunt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_debut")
	private Date dateDebut;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_fin")
	private Date dateFin;
	
	@ManyToMany
    @JoinTable(name = "compo",
            joinColumns = @JoinColumn(name = "id_emp"),
            inverseJoinColumns = @JoinColumn(name = "id_liv"))
    private List<Livre> livres;
	
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;

	/** Getters
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Setters
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getters
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/** Setters
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	

	/** Getters
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/** Setters
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/** Getters
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setters
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/** Getters
	 * @return the livres
	 */
	public List<Livre> getLivres() {
		return livres;
	}

	/** Setters
	 * @param livres the livres to set
	 */
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

}
