package models;

import java.util.Scanner;

/**
 * @Author: Fernando Emmanuel Rodríguez granados
 */
public class Producto extends Matriz {
	private String prod1, prod2;
	private double precio1, precio2, precio1Descuento, precio2Descuento;
	private Sucursal sucursal;

	public Producto(String nombre, String direccion, String prod1, String prod2, Sucursal sucursal) {
		super(nombre, direccion);
		this.prod1 = prod1;
		this.prod2 = prod2;
		this.sucursal = sucursal;
	}

	@Override
	public void vender() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el precio 1:");
		precio1 = sc.nextDouble();
		precio1Descuento = precio1 - (precio1 * 0.05);
		sc.nextLine();


		System.out.println("Ingresa el precio 2:");
		precio2 = sc.nextInt();
		precio2Descuento = precio2 - (precio2 * 0.05);
		sc.nextLine();

		System.out.println("Producto 1: " + prod1);
		System.out.println("Precio original: " + precio1);
		System.out.println("Precio con descuento: " + precio1Descuento);
		System.out.println("------------------------------");
		System.out.println("Producto 2: " + prod2);
		System.out.println("Precio original: " + precio2);
		System.out.println("Precio con descuento: " + precio2Descuento);
		System.out.println("Pago final: " + (precio2Descuento + precio1Descuento));
	}

	public void vender2() {
		precio1Descuento = precio1 * 1.1;
		precio2Descuento = precio2 * 1.1;
		precio1Descuento = Math.round(precio1Descuento);
		precio2Descuento = Math.round(precio2Descuento);

		System.out.println("----Vender2----");
		System.out.println("Sucursal donde se encuentran: " + sucursal.getNombre());
		System.out.println("Estado: " + sucursal.getEstado());
		System.out.println("Producto 1: " + prod1);
		System.out.println("Precio 1 original: " + precio1);
		System.out.println("Precio con incremento del 10%: " + precio1Descuento);
		System.out.println("---------------------------");
		System.out.println("Producto 2: " + prod2);
		System.out.println("Precio 2 original: " + precio2);
		System.out.println("Precio con incremento del 10%: " + precio2Descuento);
	}
}
