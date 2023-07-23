package conta;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numeroConta = 0;
		String agencia = "";
		String nomeCliente = "";
		double saldo = 0;
		
		System.out.printf("Por favor, digite o número da conta.\n");
		numeroConta = scan.nextInt();
		
		System.out.printf("Por favor, digite o número da agência com dígito verificador.\n");
		agencia = scan.next();
		
		System.out.printf("Por favor, digite o  nome do cliente.\n");
		nomeCliente = scan.next();
		
		System.out.printf("Por favor, digite o saldo.\n");
		saldo = scan.nextDouble();
		
		System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque." , nomeCliente, agencia, numeroConta, saldo));
		
		
	}

}
