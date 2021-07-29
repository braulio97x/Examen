package ups.edu.examen.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.examen.dao.CarreraDAO;
import ups.edu.examen.dao.UniversidadDAO;
import ups.edu.examen.modelo.Carrera;
import ups.edu.examen.modelo.Universidad;
@Stateless
public class UniversidadON {
	@Inject
	private UniversidadDAO daoUniversidad;

	public void insertUniversidad(Universidad universidad) throws Exception {

		daoUniversidad.insert(universidad);
	}

	public void updateUniversidad(Universidad universidad) throws Exception {

		daoUniversidad.update(universidad);
	}

	public void deleteUniversidad(Universidad universidad) throws Exception {
		String com = String.valueOf(universidad.getCodUni());
		daoUniversidad.delete(com);
	}

	public List<Universidad> getUniversidad() {

		

		return daoUniversidad.getUniversidades("%");
	}

	public Universidad getUniversidad(String car) {
		Universidad p = daoUniversidad.read(car);
		return p;
	}
}
