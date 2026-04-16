package HerenciaYSobreescritura;

public class Producto {
	
	private String codigo;
	private String nombre;
	private double precio;
	private int fechaVencido;
	
	public Producto(String codigo, String nombre, int precio, int fechaVencido) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fechaVencido = fechaVencido;
	}
	
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getFechaVencido() {
		return fechaVencido;
	}
	public void setFechaVencido(int fechaVencido) {
		this.fechaVencido = fechaVencido;
	}



	public double aplicarDescuento(double porcentaje) {
		
		precio = precio - (precio * porcentaje / 100);
		
		return precio;
	}
	
	public void estaVencido(int vencimiento) {
		
		if(vencimiento >= this.fechaVencido) {
			System.out.println("El producto ya Vencio. ");
		}else {
			System.out.println("El producto puede consumirse. ");
		}
		
	}
	
	public void mostrar() {
		System.out.println("Codigo: "+ codigo);
		System.out.println("Nombre: "+ nombre);
		System.out.println("precio: "+ precio+"\n");
	}

}
