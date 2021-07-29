package ups.edu.examen.dao;

import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.examen.modelo.Universidad;



@Stateless
public class UniversidadDAO {
	@PersistenceContext
	private EntityManager em;

	public void insert(Universidad universidad) {
		em.persist(universidad);
	}

	public void update(Universidad universidad) {
		em.merge(universidad);
	}

	public Universidad read(String codUni) {
		Universidad p = em.find(Universidad.class, codUni);
		return p;
	}

	public void delete(String codUni) {
		Universidad p = em.find(Universidad.class, codUni);
		em.remove(p);
	}

	public List<Universidad> getUniversidades(String codUni){
		
		String jpql2="SELECT p FROM Universidad p WHERE nombre LIKE ?1";
		
		codUni= codUni+"%";
		Query query= em.createQuery(jpql2, Universidad.class);
		query.setParameter(1, codUni);
		
		List<Universidad> universidades=query.getResultList();
		return universidades;
		
	}
}
