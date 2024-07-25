import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        var conta = new ContaTerminal();

        System.out.println("Por favor, digite o seu nome: ");
        System.out.print(">>> ");
        conta.nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da sua conta: ");
        System.out.print(">>> ");
        conta.numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da sua agência: ");
        System.out.print(">>> ");
        conta.agencia = scanner.nextLine();
        System.out.println("Por favor, informe o valor de depósito inicial: ");
        System.out.print(">>> ");
        conta.saldo = scanner.nextDouble();

        System.out.printf(
                "Olá, %s! " +
                "Obrigado por criar uma conta em nosso banco. " +
                "Sua agência é %s, conta %d e seu saldo de R$ %.2f " +
                "já está disponível para saque.",
                conta.nomeCliente, conta.agencia, conta.numero, conta.saldo
        );
    }
}
