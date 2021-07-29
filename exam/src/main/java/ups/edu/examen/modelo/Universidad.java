package ups.edu.examen.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Universidad {
@Id
	private int codUni;
	private String nombre;
	private String direccion;
	private String telefono;

	public int getCodUni() {
		return codUni;
	}

	public void setCodUni(int codUni) {
		this.codUni = codUni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
