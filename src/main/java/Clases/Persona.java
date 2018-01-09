package Clases;
import java.time.LocalDate;

/**
 * Clase persona
 * 
 * @author Ismael Martin
 *
 */
public class Persona {

	private String nombre;
	private String apellido;
	private LocalDate fecha_nacimiento;
	private int telefono;
	private String email;
	private Direccion direccion;

	// Constructores
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellido, LocalDate fecha_nacimiento, int telefono, String email,
			Direccion direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
	}

	// Informacion
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido + "\nNacido -> " + this.fecha_nacimiento + "\nTeléfono -> "
				+ this.telefono + "\nEmail -> " + this.email + "\n" + direccion;
	}

	// Get and Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

}
