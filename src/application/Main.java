package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func1 = new Funcionario();
		
		System.out.println("Digite o nome do funcionario: ");
		func1.nome = sc.nextLine();
		System.out.println("Digite o salario bruto do funcionario: ");
		func1.salarioBruto = sc.nextDouble();
		System.out.println("Digite o imposto sobre o funcionario: ");
		func1.imposto = sc.nextDouble();
		
		System.out.printf("Funcionário: %s, $ %.2f\n", func1.nome, func1.salarioLiquido());
		
		System.out.println("Qual a porcentagem de incremento no salário?");
		double porc = sc.nextDouble();
		
		func1.atualizaSalario(porc);	
		sc.close();
	}
}