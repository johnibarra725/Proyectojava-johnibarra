package programajava;

public class Congeladonitrogeno extends Productofrio {
	private String metodoCongelado;
	private float tiempoExposicion;
	
	public Congeladonitrogeno(String fechaCaducidad, int numeroLote, String fechaEmvasado, String paisdeorigen,
			float temRecomendada, String metodoCongelado, float tiempoExposicion) {
		super(fechaCaducidad, numeroLote, fechaEmvasado, paisdeorigen, temRecomendada);
		this.metodoCongelado = metodoCongelado;
		this.tiempoExposicion = tiempoExposicion;
	}
	public String getMetodoCongelado() {
		return metodoCongelado;
	}
	public void setMetodoCongelado(String metodoCongelado) {
		this.metodoCongelado = metodoCongelado;
	}
	public float getTiempoExposicion() {
		return tiempoExposicion;
	}
	public void setTiempoExposicion(float tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}

	
	public void resultados() {
		
		System.out.println("Metodo de congelado: "+metodoCongelado+
				"\nEl tiempo de exposicion fue de "+tiempoExposicion+" horas");
	}
}
