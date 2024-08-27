import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saudação inicial
        System.out.println("Olá! Vamos criar sua conta bancária.");

        // Solicitar e capturar as informações da conta
        System.out.print("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o número da sua agência: ");
        String agencia = scanner.next();

        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Formatar o saldo para o formato monetário em PtBR
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String saldoFormatado = formatoMoeda.format(saldo);

        // Exibir a mensagem final
        String mensagem = "Olá " + nomeCliente + ", sua conta foi criada com sucesso! "
                + "Agência: " + agencia + ", Conta: " + numeroConta + ", Saldo: " + saldoFormatado + ".";

        System.out.println(mensagem);

        scanner.close();
    }
}
