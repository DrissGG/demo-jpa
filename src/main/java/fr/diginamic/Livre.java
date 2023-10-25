/**
 * 
 */
package fr.diginamic;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

/**
 * @author driss
 *
 */
@Entity
@Table(name="LIVRE")
public class Livre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String titre;
	private String auteur;
	
	@ManyToMany
    @JoinTable(name = "compo",
            joinColumns = @JoinColumn(name = "id_emp"),
            inverseJoinColumns = @JoinColumn(name = "id_liv"))
    private List<Emprunt> emprunt;
	/** Constructor
	 * 
	 */
	public Livre() {
	}
	
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
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/** Setters
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/** Getters
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}
	/** Setters
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur +   "]";
	}
	
	

}
