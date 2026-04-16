package HerenciaYSobreescritura;

public class Cuenta {
	protected double saldo;
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double monto) {
		saldo += monto;
	}
	
	public void retirar(double monto) {
		saldo -= monto;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}
	

}
