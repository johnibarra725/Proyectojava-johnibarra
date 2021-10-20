package programajava;

public class Productorefrigerado extends Productofrio{
	
	private String codSupervision;

	public Productorefrigerado(String fechaCaducidad, int numeroLote, String fechaEmvasado, String paisdeorigen,
			float temRecomendada, String codSupervision) {
		super(fechaCaducidad, numeroLote, fechaEmvasado, paisdeorigen, temRecomendada);
		this.codSupervision = codSupervision;
	}

	public String getCodSupervicion() {
		return codSupervision;
	}

	public void setCodSupervicion(String codSupervicion) {
		this.codSupervision = codSupervicion;
	}
	public void resultados() {
		
		System.out.println("El codigo del supervisor es: "+codSupervision);
	}

}
