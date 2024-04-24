package models;
/**
 * @Author: Fernando Emmanuel Rodríguez granados
 */

public class Sucursal extends Matriz {
	private String estado;
	public Sucursal(String nombre, String direccion, String estado) {
		super(nombre, direccion);
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

	@Override
	public String getDireccion() {
		return super.getDireccion();
	}

	@Override
	public String getNombre() {
		return super.getNombre();
	}

	public void datos() {
		System.out.println("Estado: " + this.estado);
		System.out.println("Nombre(padre): " + this.nombre);
		System.out.println("Direccion(padre): " + this.direccion);
	}
}
