package src;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da sua conta:");
        int numeroConta = scan.nextInt();

        System.out.println("Digite o número da sua agência:");
        String numeroAgencia = scan.next();

        System.out.println("Digite o seu nome:");
        String nomeCliente = scan.next();

        System.out.println("Digite o saldo disponível:");
        double saldoConta = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de "
                + saldoConta + " já está disponível para saque");
    }
}
