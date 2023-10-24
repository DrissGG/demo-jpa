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
public class ConnexionJpa {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa_essai");
		EntityManager em = emFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		Region region1 = new Region();
		Region region2 = new Region();
		Region region3 = new Region();
		Region region4 = new Region();
		
		region1.setNom("Auvergne");
		region2.setNom("Languedoc-Roussillon");
		region3.setNom("Alsace");
		region4.setNom("Lorraine");
		
		
		transaction.begin();
		em.persist(region1);
		em.persist(region2);
		em.persist(region3);
		em.persist(region4);
		transaction.commit();
		
		int idRegion = 3;		
		Region r = em.find(Region.class, idRegion);
		if(r!=null) {
			System.out.println("region extraite de L'ID "+r.getId()+" est "+ r.getNom());
		}else {
			System.out.println("region Non trouvee pour ID : " + idRegion);
		}
		
		em.close();
		emFactory.close();
	}

}
