package HerenciaYSobreescritura;

public class main {

	public static void main(String[] args) {
		Vehiculo v1 = new Vehiculo("Toyota",150);
		Moto moto = new Moto("Yamaha", 250, 3);
		
		v1.mostrarInfo();
		moto.mostrarInfo();
	}
}
