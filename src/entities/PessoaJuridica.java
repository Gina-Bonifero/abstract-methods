package entities;

public class PessoaJuridica extends Pessoa {
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	
	@Override
	public Double impostoTotal() {
		if (getNumeroFuncionarios() < 11) {
			return (getRendaAnual() * 0.16);
		} else {
			return (getRendaAnual() * 0.14);
		}
	}
}
