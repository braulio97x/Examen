package ups.edu.examen.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ups.edu.examen.business.CarreraON;
import ups.edu.examen.modelo.Carrera;

@Named
@RequestScoped
public class CarreraBean {
	private Carrera newCarrera = new Carrera();
	private List<Carrera> carreras;
	@Inject
	private CarreraON carreraON;
	
	@PostConstruct
	public void init() {
		carreras = carreraON.getCarreras();
		System.out.println(carreras);
	}

	public Carrera getNewCarrera() {
		return newCarrera;
	}

	public void setNewCarrera(Carrera newCarrera) {
		this.newCarrera = newCarrera;
	}
	
	
	public String guardarCarrera() {

		try {
			carreraON.insertCarrera(newCarrera);
			System.out.println("Inserto carrera");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return "lista-personaPro?faces-redirect=true";
	}

	
	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}

	
	
	
	
}
