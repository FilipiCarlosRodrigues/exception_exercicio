package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Informe os dados da conta");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		/*para consumir o enter que o usuario aperta na hora de confirmar a resposta anterios*/
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Saldo incial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, name, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		

		try {
			acc.withdraw(amount);
			System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
