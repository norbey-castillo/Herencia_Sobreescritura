package HerenciaYSobreescritura;

public class Bus extends Transporte {
	private String ruta;

	public Bus(int capacidad, String ruta) {
		super(capacidad);
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	@Override
	public void Descripcion() {
		System.out.println("\tEl Bus es: \nGrande \nCon varios asientos \nVeloz \n\tEL bus va hacia: \n"+ruta);
		
	}

}
