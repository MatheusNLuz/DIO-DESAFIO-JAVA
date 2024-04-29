import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        cliente.setNomeCliente(scanner.nextLine());
        System.out.println("Digite o número da conta: ");
        cliente.setNumeroDaConta(scanner.nextInt());
        System.out.println("Digite a agência: ");
        cliente.setAgencia(scanner.next());
        System.out.println("Digite o saldo: ");
        cliente.setSaldo(scanner.nextDouble());

        System.out.println("Olá " + cliente.getNomeCliente() + "obrigado por criar uma conta em nosso banco, sua agência é " + cliente.getAgencia() + " e o numero da sua conta é " + cliente.getNumeroDaConta() + " e seu saldo " + cliente.getSaldo() + " já está disponivel para saque!");
	    System.out.println("Deseja realizar um saque? (S/N)");

        String resposta = scanner.next();

	    if (resposta.equals("S")) {
            System.out.println("Digite o valor do saque: ");
            double saque = scanner.nextDouble();
            if (saque > cliente.getSaldo()) {
                System.out.println("Saldo insuficiente");
            } else {
                double saldo = cliente.getSaldo();
                saldo -= saque;
                System.out.println("Saque realizado com sucesso, seu saldo atual é: " + saldo);
            }
	    }
    }
}
