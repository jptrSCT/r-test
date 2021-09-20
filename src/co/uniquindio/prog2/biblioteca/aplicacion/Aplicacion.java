package co.uniquindio.prog2.biblioteca.aplicacion;

import javax.swing.JOptionPane;
import co.uniquindio.prog2.biblioteca.model.Biblioteca;
import co.uniquindio.prog2.biblioteca.model.Libro;

public class Aplicacion
{

	public static void main ( String[] args )
	{

		Biblioteca biblitecaUQ = new Biblioteca();

		biblitecaUQ.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));

		System.out.println(biblitecaUQ.toString());

		Libro libro = new Libro("1234");

		libro.setBiblioteca(biblitecaUQ);

		System.out.println(libro.toString());

	}

	//ooo
}
