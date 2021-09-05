package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			Double rendaAnual = sc.nextDouble();
			
			if (c == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
			} else {
				System.out.print("Number of employees: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, numeroFuncionarios));
			}
		}
		
		System.out.println();
		
		System.out.println("TAXES PAID: ");
		for (Pessoa pessoa : list) {
			System.out.println(pessoa);
		}
		
		System.out.println();
		
		double sum = 0.0;
		for (Pessoa pessoa : list) {
			
			sum += pessoa.impostoTotal();
		}
			System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		sc.close();
	}

}
