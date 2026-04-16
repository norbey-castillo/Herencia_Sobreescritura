package HerenciaYSobreescritura;

public class main {

	public static void main(String[] args) {
		
		Transporte t1 = new Transporte(50);
		Bus b1 = new Bus(30, "Jutiapa");
		t1.Descripcion();
		b1.Descripcion();
	}

}
