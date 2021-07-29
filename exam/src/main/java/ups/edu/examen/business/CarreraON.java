package ups.edu.examen.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.examen.dao.CarreraDAO;
import ups.edu.examen.modelo.Carrera;

@Stateless
public class CarreraON {
@Inject

private CarreraDAO daoCarrera;

public void insertCarrera(Carrera carrera) throws Exception {

	daoCarrera.insert(carrera);
}

public void updateCarrera(Carrera carrera) throws Exception {

	daoCarrera.update(carrera);
}

public void deleteCarrera(Carrera carrera) throws Exception {
	String com = String.valueOf(carrera.getCodCar());
	daoCarrera.delete(com);
}

public List<Carrera> getCarreras() {

	

	return daoCarrera.getCarreras("%");
}

public Carrera getCarrera(String car) {
	Carrera p = daoCarrera.read(car);
	return p;
}

}
