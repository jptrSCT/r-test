package co.uniquindio.prog2.biblioteca.model;

public class Libro {
	
	/**
	 * 
	 * @param isbn
	 */
	private String isbn;
	
	/*** relaciones ***/
	
	private Biblioteca biblioteca;

	public Libro(String isbn) {
		super();
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", biblioteca=" + biblioteca.getNombre() + "]";
	}


}
