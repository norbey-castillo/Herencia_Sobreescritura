package HerenciaYSobreescritura;

public class Moto extends Vehiculo{
	private int cilindrada;

	public Moto(String marca, int velocidad, int cilindrada) {
		super(marca, velocidad);
		this.cilindrada = cilindrada;
	}
	
	public void mostrarInfo() {
		System.out.println("\nLa moto es marca: "+ getMarca() );
		System.out.println("Tiene una velocidad de hasta: "+ getVelocidad() +" km/s" );
		System.out.println("El cilindraje es: "+cilindrada );

	}

}
