import java.util.Scanner;

public class CabineDeVotacao {
	public static void main(String[] args) {
		Scanner idadeEntrada = new Scanner(System.in);
		System.out.print("Qual é a sua idade?: ");
		int idade = idadeEntrada.nextInt();
		
		if (idade < 16) {
		 	System.out.println("Você ainda não pode votar.");

		} else if ((idade >= 16 && idade < 18) || idade > 70) {
		 		System.out.println("Seu voto é facultativo.");

		} else {
		 		System.out.println("Seu voto é obrigatório.");
		}

		idadeEntrada.close();
		
	}
}