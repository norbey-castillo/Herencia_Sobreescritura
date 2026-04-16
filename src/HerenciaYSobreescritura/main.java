package HerenciaYSobreescritura;

public class main {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(2500);
		CuentaAhorros ahorro = new CuentaAhorros(1000, 10);
		
		cuenta.depositar(350);
		cuenta.retirar(920);
		
		ahorro.depositar(500);
		ahorro.retirar(2500);
		
		System.out.println(ahorro.saldo+"\n");
		System.out.println(cuenta.saldo+"\n");
		
	}

}
