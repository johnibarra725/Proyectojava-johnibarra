package programajava;

public class Congeladoaire extends Productofrio{
	private float nitrogeno;
	private float oxigeno;
	private float dioxCarbono;
	private float vaporAgua;
	private String composicion;
	
	public Congeladoaire(String fechaCaducidad, int numeroLote, String fechaEmvasado, String paisdeorigen,
			float temRecomendada, float nitrogeno, float oxigeno, float dioxCarbono, float vaporAgua, String composicion) {
		
		super(fechaCaducidad, numeroLote, fechaEmvasado, paisdeorigen, temRecomendada);
		this.nitrogeno = nitrogeno;
		this.oxigeno = oxigeno;
		this.dioxCarbono = dioxCarbono;
		this.vaporAgua = vaporAgua;
		this.composicion = composicion;
	}

	public float getNitrogeno() {
		return nitrogeno;
	}

	public void setNitrogeno(float nitrogeno) {
		this.nitrogeno = nitrogeno;
	}

	public float getOxigeno() {
		return oxigeno;
	}

	public void setOxigeno(float oxigeno) {
		this.oxigeno = oxigeno;
	}

	public float getDioxCarbono() {
		return dioxCarbono;
	}

	public void setDioxCarbono(float dioxCarbono) {
		this.dioxCarbono = dioxCarbono;
	}

	public float getVaporAgua() {
		return vaporAgua;
	}

	public void setVaporAgua(float vaporAgua) {
		this.vaporAgua = vaporAgua;
	}

	public String getComposicion() {
		return composicion;
	}

	public void setComposicion(String composicion) {
		this.composicion = composicion;
	}
	
	public void resultados() {
		System.out.println("Hay "+nitrogeno+" gramos de nitrogeno"
				+"\nHay "+oxigeno+" gramos de oxigeno"
				+"\nHay "+dioxCarbono+" gramos de dioxido de carbono"
				+"\n El vapor del agua es de "+vaporAgua+" grados"
				+"\nEstos alimentos estan compuestos de "+composicion);
		
	}
}
