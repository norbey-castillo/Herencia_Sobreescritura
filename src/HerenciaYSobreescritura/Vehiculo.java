package HerenciaYSobreescritura;

public class Vehiculo {
	private String marca;
	private int velocidad;
	
	public Vehiculo(String marca, int velocidad) {
		super();
		this.marca = marca;
		this.velocidad = velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void mostrarInfo() {
		System.out.println("EL vehiculo es marca: "+ marca);
		System.out.println("Tiene una velocidad de hasta: "+velocidad+" km/s" );
	}
	
}
