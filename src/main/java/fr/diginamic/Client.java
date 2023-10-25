/**
 * 
 */
package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author driss
 *
 */
 @Entity
public class Client {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 
	 private String nom;
	 private String prenom;
	 
	 @OneToMany(mappedBy="client")
//	 @JoinColumn(name="")
	 private List<Emprunt> emprunts;

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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setters
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getters
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setters
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getters
	 * @return the emprunts
	 */
	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	/** Setters
	 * @param emprunts the emprunts to set
	 */
	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
	 
}
