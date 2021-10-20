package programajava;

public abstract class Producto {
	private String fechaCaducidad;
	private int numeroLote;
	private String fechaEmvasado;
	private String paisdeorigen;
	
	
	
	
	public Producto(String fechaCaducidad, int numeroLote,String fechaEmvasado, String paisdeorigen) {
		
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
		this.fechaEmvasado = fechaEmvasado;
		this.paisdeorigen = paisdeorigen;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	public String getFechaEmvasado() {
		return fechaEmvasado;
	}
	public void setFechaEmvasado(String fechaEmvasado) {
		this.fechaEmvasado = fechaEmvasado;
	}
	public String getPaisdeorigen() {
		return paisdeorigen;
	}
	public void setPaisdeorigen(String paisdeorigen) {
		this.paisdeorigen = paisdeorigen;
	}
	
	public void resultados() {
		System.out.println("Este producto caduca el: "+fechaCaducidad
				+"\nEl numero del lote es: "+numeroLote
				+"\nLa fecha de evasado es el "+fechaEmvasado
				+"\nViene de "+paisdeorigen);
	}

}
