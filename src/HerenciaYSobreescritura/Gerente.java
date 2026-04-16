package HerenciaYSobreescritura;

public class Gerente extends Empleado {
	private double BonoAdicional;

	public Gerente(String nombre, double salario, double bonoAdicional) {
		super(nombre, salario);
		BonoAdicional = bonoAdicional;
	}

	public double getBonoAdicional() {
		return BonoAdicional;
	}

	public void setBonoAdicional(double bonoAdicional) {
		BonoAdicional = bonoAdicional;
	}
	
	public void CalcularSalario() {
		System.out.println("El salario total mas bono adicional es: "+(getSalario()+this.BonoAdicional));
	}
	

}
