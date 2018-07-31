package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<String> nome = new ArrayList<>();
		List<Integer> id = new ArrayList<>();
		List<Double> salario = new ArrayList<>();

		System.out.println("Quantos funcionarios sera cadastrado");
		int qtd = sc.nextInt();
		
		for(int i = 0;i<qtd;i++) {
			sc.nextLine();
			System.out.println("Digite o nome do funcionario:");
			nome.add(sc.nextLine());
			
			System.out.println("Digite o codigo do funcionario:");
			id.add(sc.nextInt());
			
			System.out.println("Digite o salario do funcionario:");
			salario.add(sc.nextDouble());
		}
		for (int i=0;i<qtd;i++) {
			System.out.println("Nome: "+ nome.get(i));
			System.out.println("ID: "+ id.get(i));
			System.out.println("Salario: "+ salario.get(i));
		}
		boolean dentro = false;
		while(dentro== false) {
		System.out.println("Qual o id do funcionario a receber aumento?");
		int idIn = sc.nextInt();
		
		if(id.stream().filter(x -> x ==idIn).findFirst().orElse(null)!=null) {
			System.out.println("Digite em porcentagem seu aumento:");
			double aumento = sc.nextInt();
			int x=id.indexOf(idIn);  //<-------------Isso aqui procura a posição dessa porra na list ==============================================================================
			
			double result = salario.get(x)*(aumento/100);
			salario.set(x,salario.get(x)+result);
		
			
			System.out.println("Seu salario agora é: "+salario.get(x));
			dentro = true;
		
		}else {
			System.out.println("Id invalido:");
			
			for (int i=0;i<qtd;i++) {
				System.out.println("Nome: "+ nome.get(i));
				System.out.println("ID: "+ id.get(i));
				System.out.println("Salario: "+ salario.get(i));
			}
			
		}
		}
		System.out.println("Deseja visualizar os cadastros uma ultima vez (y/n)?");
		sc.nextLine();
		char x = sc.nextLine().charAt(0);
		if(x == 'y') {
			for (int i=0;i<qtd;i++) {
				System.out.println("Nome: "+ nome.get(i));
				System.out.println("ID: "+ id.get(i));
				System.out.println("Salario: "+ salario.get(i));
			}
		}else {
			System.out.println("----------------------------------------");
			System.out.println("         !!!FIM DO PROGRAMA!!!");
			System.out.println("----------------------------------------");
			
		}
		sc.close();
	}
}
