package Clases;
/**
 * Clase direccion
 * @author Ismael Martin
 *
 */
public class Direccion {
	private int numero;
	private String calle;
	private String ciudad;
	private String pais;
	
	//Constructores
	public Direccion() {
		// TODO Auto-generated constructor stub
	}
	public Direccion(int numero, String calle, String ciudad, String pais) {
		this.numero = numero;
		this.calle = calle;
		this.ciudad = ciudad;
		this.pais = pais;
	}
	//Informacion
	@Override
	public String toString() {
		return "Direccion -> "+this.calle + " nª: "+this.numero + " "+this.ciudad + " "+this.pais;
	}
	
	//Get and Set
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
	

}
