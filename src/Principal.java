
public class Principal {

	//main: es el motor de arranque de toda aplicacion
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realizar la creación de objetos
		//NombreClase nombreObjeto = new Constructores();
		
		//Realizar la instancia de clase utilizando el constructor vacion y asignacion de valores utilizano e encapsulamiento
		
		Productos producto = new Productos();
		
		producto.setNombre("Barritas");
		producto.setPrecio(20.5f);
		producto.setStock(5);
		producto.setStatus(true);
		
		System.out.println("Datos del producto 1");
		System.out.println("Nombre " + producto.getNombre());
		System.out.println("Precio " + producto.getPrecio());
		System.out.println("Stock " + producto.getPrecio());
		System.out.println("Estatus " + producto.isStatus());
		
		Productos producto2 = new Productos("Sabritas",18,3,true);
		
		System.out.println("Datos del producto 2");
		System.out.println(producto2);
		
	}

}
