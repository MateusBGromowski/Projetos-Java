import java.util.Scanner;

public class Calculadora {
	public static void main (String[] args) {
		System.out.println("Bem vindo à calculadora!");
		Scanner entrada = new Scanner(System.in);
		double num = 0;
		double num2 = 0;
		while (true) {
			System.out.println("\n1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Potenciação");
			System.out.println("6 - Radiciação");
			System.out.println("7 - Sair");
			System.out.print("Sua escolha: ");
			int selecao = entrada.nextInt();
			if (selecao == 1) {
				System.out.print("Adicione um número: ");
				num = entrada.nextDouble();
				System.out.print("Adicione mais um número: ");
				num2 = entrada.nextDouble();
				double soma = num + num2;
				System.out.println("A soma entre "+num+" e "+num2+" é igual a "+soma+".");
			} else if (selecao == 2) {
				System.out.print("Adicione um número: ");
				num = entrada.nextDouble();
				System.out.print("Adicione mais um número: ");
				num2 = entrada.nextDouble();
				double subtração = num - num2;
				System.out.println("A subtração entre "+num+" e "+num2+" é igual a "+subtração+".");				
			} else if (selecao == 3) {
				System.out.print("Adicione um número: ");
				num = entrada.nextDouble();
				System.out.print("Adicione mais um número: ");
				num2 = entrada.nextDouble();
				double mult = num * num2;
				System.out.println(num+" Vezes "+num2+" é igual a "+mult+".");				
			} else if (selecao == 4) {
				System.out.print("Adicione um número: ");
				num = entrada.nextDouble();
				System.out.print("Adicione mais um número: ");
				num2 = entrada.nextDouble();
				double div = num / num2;
				System.out.println(num+" dividido por "+num2+" é igual a "+div+".");					
			} else if (selecao == 5) {
				System.out.print("Adicione um número: ");
				num = entrada.nextDouble();
				System.out.print("Adicione mais um número: ");
				num2 = entrada.nextDouble();
				double pot = Math.pow(num, num2);
				System.out.println(num+" elevado a "+num2+" é igual a "+pot+".");
			} else if (selecao == 6) {
				System.out.print("Adicione um número: ");
				num = entrada.nextDouble();
				double raiz = Math.sqrt(num);
				System.out.println("A raíz quadrada de "+num+" é igual a "+ raiz+".");				
			} else if (selecao == 7) {
				System.out.println("Obrigado por usar a calculadora.");
				System.exit(0);
			} else {
				System.out.println("Entrada inválida");
			}

		}
	}
}