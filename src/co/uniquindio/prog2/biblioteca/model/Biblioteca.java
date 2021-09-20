package co.uniquindio.prog2.biblioteca.model;

/**
 * Clase
 * @author johangiraldohurtado
 *
 */
public class Biblioteca {
	
	/**
	 * Atributo
	 */
	private String nombre;
	
	/**
	 * 
	 */
	private String direccion;
	
	/**
	 * Construtor
	 * @param nombre
	 * @param direccion
	 */
	public Biblioteca(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	/**
	 * Constructor
	 * @param nombre
	 */
	public Biblioteca(String nombre){
		this.nombre = nombre;
	}
	
	
	public Biblioteca() {
		super();
	}

	/**
	 * set nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * get nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * set direccion
	 * @param direccion Es el parametro que representa la direccion de la biblioteca
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * get direccion
	 * @return retorna la direccion de la biblioteca
	 */
	public String getDireccion() {
		return direccion;
	}

	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
}
