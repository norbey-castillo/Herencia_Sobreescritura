package HerenciaYSobreescritura;

public class main {

	public static void main(String[] args) {
		Persona p1 = new Persona("Oscar",20);
		Docente d1 = new Docente("Walter",37,"programador");
		Estudiante e1 = new Estudiante("Norbey",20,"0905-25-9175");
		
		p1.mostrar();
		d1.mostrar();
		e1.mostrar();
		
	}

}
