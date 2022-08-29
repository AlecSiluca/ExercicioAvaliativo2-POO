package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto-imposto;
	}
	public void atualizaSalario(double porcentagem) {
		double salarioAumentado = this.salarioLiquido() + (this.salarioBruto * porcentagem) / 100;
		System.out.printf("Dados atualizados: %s, $ %.2f", this.nome, salarioAumentado);
	}
}