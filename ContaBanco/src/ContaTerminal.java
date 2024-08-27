import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sauda��o inicial
        System.out.println("Ol�! Vamos criar sua conta banc�ria.");

        // Solicitar e capturar as informa��es da conta
        System.out.print("Digite o n�mero da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o n�mero da sua ag�ncia: ");
        String agencia = scanner.next();

        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Formatar o saldo para o formato monet�rio em PtBR
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String saldoFormatado = formatoMoeda.format(saldo);

        // Exibir a mensagem final
        String mensagem = "Ol� " + nomeCliente + ", sua conta foi criada com sucesso! "
                + "Ag�ncia: " + agencia + ", Conta: " + numeroConta + ", Saldo: " + saldoFormatado + ".";

        System.out.println(mensagem);

        scanner.close();
    }
}
