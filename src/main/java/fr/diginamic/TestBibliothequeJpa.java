/**
 * 
 */
package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author driss
 *
 */
public class TestBibliothequeJpa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa_essai");
		EntityManager em = emFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		int idLivre = 3;		
		Livre r = em.find(Livre.class, idLivre);
		if(r!=null) {
			System.out.println("livre extraite de L'ID "+r.getId()+" auteur : "+ r.getAuteur() +" Titre: "+ r.getTitre());
		}else {
			System.out.println("livre Non trouvee pour ID : " + idLivre);
		}
		
		int idEmprunt = 1;
		Emprunt emprunt = em.find(Emprunt.class,idEmprunt);
		if(emprunt!=null) {
			System.out.println("id emprunt  "+emprunt.getId()+" date du debut : "+ emprunt.getDateDebut() +" date fin : "+ emprunt.getDateFin()+" livre : "+ emprunt.getLivres());
			
		}else {
			System.out.println("emprunt  Non trouvee pour ID : " + idEmprunt);
		}

	}

}
