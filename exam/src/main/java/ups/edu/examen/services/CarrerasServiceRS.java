package ups.edu.examen.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ups.edu.examen.business.CarreraON;
import ups.edu.examen.modelo.Carrera;
import ups.edu.examen.services.modelo.CarreraTemp;






@Path("carreras")
public class CarrerasServiceRS {
	@Inject
	private CarreraON carrerasON;

	@PUT
	@Path("/registrar")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public String registrarCarrera(Carrera carrera) {
		try {
			carrerasON.insertCarrera(carrera);
			return "OK";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "ERROR";
		}
	}

	
	
	
	
	@GET
	@Path("listarCar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CarreraTemp> getCarreras() {
		List<Carrera> listado = carrerasON.getCarreras();
		List<CarreraTemp> carreras=new ArrayList<CarreraTemp>();
		for (Carrera c : listado) {
			CarreraTemp ct = new CarreraTemp();
			ct.setCodCar(c.getCodCar());
			ct.setNombre(c.getNombre());
			ct.setDirCarrera(c.getDirCarrera());
			//ct.setNombreCompleto(c.getApellido()+ " " + c.getNombre());
			carreras.add(ct);
		}
		return carreras;
	}
}
