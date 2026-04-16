package HerenciaYSobreescritura;

public class main {

	public static void main(String[] args) {
		Figura f1 = new Figura();
		Rectangulo r1 = new Rectangulo(5,6);
		Circulo c1 = new Circulo(10);
		
		f1.calcularArea();
		r1.calcularArea();
		c1.calcularArea();
	}
}
