/**
 * 
 */
package fr.diginamic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author driss
 *
 */
@Entity
public class Region {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		/** id : int*/
		private int  id;
		/** nom : String*/
		private String nom;
		
		/** Constructeur
		 * @param code code
		 * @param nom nom
		 */
		public Region() {
		}
		
	
		
		/** Getter
		 * @return the code
		 */
		public int getId() {
			return id;
		}
		/** Setter
		 * @param code the code to set
		 */
		public void setI(int idRegion) {
			this.id = idRegion;
		}
		/** Getter
		 * @return the nom
		 */
		public String getNom() {
			return nom;
		}
		/** Setter
		 * @param nom the nom to set
		 */
		public void setNom(String nom) {
			this.nom = nom;
		}
		

		
	

}
