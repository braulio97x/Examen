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

import ups.edu.examen.business.UniversidadON;
import ups.edu.examen.modelo.Universidad;
import ups.edu.examen.services.modelo.UniversidadTemp;






@Path("universidades")
public class UniversidadesServiceRS {
	@Inject
	private UniversidadON universidadON;

	@PUT
	@Path("/registrar")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public String registrarUniversidad(Universidad universidad) {
		try {
			universidadON.insertUniversidad(universidad);
			return "OK";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "ERROR";
		}
	}

	
	
	
	
	@GET
	@Path("listarUni")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UniversidadTemp> getUniversidades() {
		List<Universidad> listado = universidadON.getUniversidad();
		List<UniversidadTemp> universidades=new ArrayList<UniversidadTemp>();
		for (Universidad c : listado) {
			UniversidadTemp ct = new UniversidadTemp();
			ct.setCodUni(c.getCodUni());
			ct.setNombre(c.getNombre());
			ct.setDireccion(c.getDireccion());
			//ct.setNombreCompleto(c.getApellido()+ " " + c.getNombre());
			universidades.add(ct);
		}
		return universidades;
	}
}
