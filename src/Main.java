import models.Producto;
import models.Sucursal;

/**
 * @Author: Fernando Emmanuel Rodríguez granados
 */
public class Main {
	public static void main(String[] args) {
		Sucursal s = new Sucursal("Sucursal", "calle puebla 1005", "Durango");
		s.vender();
		s.datos();

		Producto p = new Producto("Sucursal", "calle puebla 1005", "Computadora", "Impresora", s);
		p.vender();
		p.vender2();

		System.out.println("##############################");
		Sucursal s2 = new Sucursal("Centauro", "calle sta maria 205", "Durango");
		s2.vender();
		s2.datos();

		Producto p2 = new Producto("Centauro", "calle sta maria 205", "Teclado", "mouse", s2);
		p2.vender();
		p2.vender2();
	}
}
