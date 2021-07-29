package ups.edu.examen.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ups.edu.examen.modelo.Carrera;



@Stateless
public class CarreraDAO {
	@PersistenceContext
	private EntityManager em;

	public void insert(Carrera carrera) {
		em.persist(carrera);
	}

	public void update(Carrera carrera) {
		em.merge(carrera);
	}

	public Carrera read(String codCar) {
		Carrera p = em.find(Carrera.class, codCar);
		return p;
	}

	public void delete(String codCar) {
		Carrera p = em.find(Carrera.class, codCar);
		em.remove(p);
	}

	public List<Carrera> getCarreras(String nombre){
		
		String jpql2="SELECT p FROM Carrera p WHERE nombre LIKE ?1";
		
		nombre= nombre+"%";
		Query query= em.createQuery(jpql2, Carrera.class);
		query.setParameter(1, nombre);
		
		List<Carrera> carreras=query.getResultList();
		return carreras;
		
	}
}
