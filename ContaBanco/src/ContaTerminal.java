import java.util.Scanner;

public class ContaTerminal {

    static int numero;
    static String agencia;
    static String nomeCliente;
    static double saldo;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite o nome do Cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        scanner.close();

    }
}