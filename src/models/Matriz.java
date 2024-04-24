package models;

/**
 * @Author: Fernando Emmanuel Rodríguez granados
 */
public class Matriz {

	public Matriz(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	protected String nombre, direccion;

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void vender() {
		System.out.println("Datos de la tienda");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Direccion: " + this.direccion);
	}
}
