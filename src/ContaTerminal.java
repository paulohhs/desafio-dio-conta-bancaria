
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
	
	public static void main(String[] args) {
		String nome;
		String agencia;
		int conta;
		double saldo;
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Seja bem-vindo(a)!");
		System.out.println("Vamos iniciar o seu cadastro!");
		
		System.out.print("Informe seu nome: ");
		nome = scanner.nextLine();
		
		System.out.print("Informe o número de sua agência: ");
		agencia = scanner.next();
		
		
		System.out.print("Informe o número de sua conta: ");
		conta = scanner.nextInt();
		
		System.out.print("Informe o valor de depósito (saldo) inicial: ");
		saldo = scanner.nextDouble();
				
		System.out.println(
			"Olá ".concat(
				nome + ", obrigado por criar uma conta em nosso banco. Sua agência é "
			).concat(
				agencia + ", conta "
			).concat(
				Integer.toString(conta) + " e seu saldo R$"
			).concat(
				Double.toString(saldo) + " já está disponível para saque."
			)
		);
	}
}










