package HerenciaYSobreescritura;

public class Circulo extends Figura{
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
	public void calcularArea(){
		double Area = 0;
		final double pi = 3.1416;
		
		Area = pi * (this.radio * this.radio);
		
		System.out.println("El area del Circulo es: "+Area);
	}
}
