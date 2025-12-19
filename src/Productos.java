//Es una plantilla para organizar los atrobutos y metodos publicos
public class Productos {
	//Atributos del objeto
	//Constantes	Fijos
	//Variables		Dinamicos
	private String nombre;
	private float precio;
	private int stock;
	private boolean status;
	
	public Productos() {
		
	}

	//Constructor
	public Productos(String nombre, float precio, int stock, boolean status) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.status = status;
	}

	//Construtor con parametros
	/*public Productos(String nombre, float precio, int stock, boolean status) {
		//Se estan inicializando los atributos del objeto
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.status = status;
	}*/

	//toString te convierte un objeto a cadena
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", status=" + status + "]";
	}

	//Encapsulmiento
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
