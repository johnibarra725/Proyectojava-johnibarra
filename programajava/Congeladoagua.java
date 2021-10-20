package programajava;

public class Congeladoagua extends Productofrio{
	
	private float salinidadAgua;

	public Congeladoagua(String fechaCaducidad, int numeroLote, String fechaEmvasado, String paisdeorigen,
			float temRecomendada, float salinidadAgua) {
		super(fechaCaducidad, numeroLote, fechaEmvasado, paisdeorigen, temRecomendada);
		this.salinidadAgua = salinidadAgua;
	}

	
	
	
	public float getSalinidadAgua() {
		return salinidadAgua;
	}
	
	public void resultados() {
		
		System.out.println("La salinidad del agua es de: "+salinidadAgua);
	}

}
