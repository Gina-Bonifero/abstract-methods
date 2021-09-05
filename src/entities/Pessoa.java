package entities;

public abstract class Pessoa {
	private String name;
	private Double rendaAnual;
	
	public Pessoa() {
	}
	
	public Pessoa(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public Double getRendaAnual() {
		return rendaAnual;
	}
	
	public abstract Double impostoTotal();
	
	public String toString() {
		return name + ": $ " + String.format("%.2f", impostoTotal());
	}
}
