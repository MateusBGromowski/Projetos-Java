import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
	public static void main(String[] args) {
		Random numeroAleatorio = new Random();
		int aleatorio = numeroAleatorio.nextInt(1, 11);
		Scanner entrada = new Scanner(System.in);
		int tentativas = 0;
		int escolha = 0;
		while (escolha != aleatorio) {
			tentativas = ++tentativas;
			System.out.print("Adivinhe um número (tentativa número "+ tentativas+") : ");
			escolha = entrada.nextInt();
			if (escolha > aleatorio) {
				System.out.println("Você errou, número muito alto.");
			} else if (escolha < aleatorio) {
				System.out.println("Você errou, número muito baixo");
			}
		}
		System.out.println("Parabéns, você acertou em "+tentativas+" tentativas!");
	}
}