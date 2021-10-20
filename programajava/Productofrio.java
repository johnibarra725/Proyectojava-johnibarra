package programajava;

public abstract class Productofrio extends Producto {
	
	float temRecomendada;

	public Productofrio(String fechaCaducidad, int numeroLote,String fechaEmvasado, String paisdeorigen,float temRecomendada) {
		super(fechaCaducidad, numeroLote, fechaEmvasado, paisdeorigen);
		this.temRecomendada = temRecomendada;
	}

	public float getTemRecomendada() {
		return temRecomendada;
	}

	public void setTemRecomendada(float temRecomendada) {
		this.temRecomendada = temRecomendada;
	}
	
	
	public void resultados() {
		System.out.println("La temperatura recomendada para los productos es de "+temRecomendada);
		
	}
	

}
