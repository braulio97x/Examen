package ups.edu.examen.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ups.edu.examen.business.CarreraON;
import ups.edu.examen.business.UniversidadON;
import ups.edu.examen.modelo.Carrera;
import ups.edu.examen.modelo.Universidad;

@Named
@RequestScoped
public class UniversidadBean {
	private Universidad newUniversidad = new Universidad();
	private List<Universidad> universidades;
	@Inject
	private UniversidadON universidadON;
	
	@PostConstruct
	public void init() {
		universidades = universidadON.getUniversidad();
		System.out.println(universidades);
	}

	public Universidad getNewUniversidad() {
		return newUniversidad;
	}

	public void setNewUniversidad(Universidad newUniversidad) {
		this.newUniversidad = newUniversidad;
	}
	
	
	public String guardarUniversidad() {

		try {
			universidadON.insertUniversidad(newUniversidad);
			System.out.println("Inserto universidad");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return "lista-personaPro?faces-redirect=true";
	}
	
	

	public List<Universidad> getUniversidades() {
		return universidades;
	}

	public void setUniversidades(List<Universidad> universidades) {
		this.universidades = universidades;
	}
	
	
	
}
