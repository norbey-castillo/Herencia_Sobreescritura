package HerenciaYSobreescritura;

public class main {

	public static void main(String[] args) {
		
	Producto p1 = new Producto("001","Arroz",5,20);
	
	System.out.println(p1.getNombre());
	System.out.println(p1.aplicarDescuento(10));
	p1.estaVencido(25);
		
	}

}
