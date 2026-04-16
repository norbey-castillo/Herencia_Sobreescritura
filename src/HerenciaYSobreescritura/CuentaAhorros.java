package HerenciaYSobreescritura;

public class CuentaAhorros extends Cuenta {
	
	private double tasa;
	
	public CuentaAhorros(double saldo, double tasa) {
		super(saldo);
		this.setTasa(tasa);
	}
	
	@Override
	public void retirar(double monto) {
		if(saldo - monto >= 0) {
			super.retirar(monto);
		}else {
			System.out.println("Saldo Insuficiente. ");
		}
	}

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}

	@Override
	public String toString() {
		return "CuentaAhorros [tasa=" + tasa + ", saldo=" + saldo + "]";
	}
	
	

}
