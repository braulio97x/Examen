package ups.edu.examen.services.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class CarreraTemp {

	private int codCar;
	private String nombre;
	private String dirCarrera;

	public int getCodCar() {
		return codCar;
	}

	public void setCodCar(int codCar) {
		this.codCar = codCar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirCarrera() {
		return dirCarrera;
	}

	public void setDirCarrera(String dirCarrera) {
		this.dirCarrera = dirCarrera;
	}

}
