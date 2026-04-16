package HerenciaYSobreescritura;

public class main {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Norbey", 9500);
		Gerente g1 = new Gerente("Oscar", 4500, 600);
		
		e1.CalcularSalario();
		g1.CalcularSalario();
	}
		

}
