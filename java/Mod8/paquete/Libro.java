package paquete;

import java.io.Serializable;

public class Libro implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	String titulo;
	String autor;
	String ISBN;
	int ano_publicacion;
	
	
	public Libro(String titulo, String autor, String ISBN, int ano_publicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.ano_publicacion = ano_publicacion;
		
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	
	public void mostrar() {
		System.out.println("Título: " + titulo + ", Autor: " + autor + ", ISBN: " + ISBN + ", Año: " + ano_publicacion);
	}
}
