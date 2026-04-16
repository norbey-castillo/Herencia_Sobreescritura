package HerenciaYSobreescritura;

public class Perro extends Animal{
	@Override
	public void hacerSonido() {
		System.out.println("El Perro hace: Guau! Guau! ");
	}

}
