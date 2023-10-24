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
public class TestJpa {

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

	}

}
