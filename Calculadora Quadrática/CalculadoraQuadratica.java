import java.util.Scanner;

public class CalculadoraQuadratica{
	
	public static void sair(Scanner entrada) {
		System.out.println("Aperte enter para sair...");
		String quit = entrada.nextLine();
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//Coeficiente A
		
		System.out.print("Insira o coeficiente A: ");
		float coefA = entrada.nextFloat();
		entrada.nextLine();

		if (coefA == 0) {
			System.out.println("Isso não é uma função quadrática.");
			sair(entrada);
			System.exit(1);
		}

		//Coeficiente B
		System.out.print("Insira o coeficiente B: ");
		float coefB = entrada.nextFloat();

		//Coeficiente C
		System.out.print("Insira o coeficiente C: ");
		float coefC = entrada.nextFloat();
		entrada.nextLine();

		//Cálculo do Delta
		double delta = Math.pow(coefB,2)-4*coefA*coefC;
		if (delta < 0) {
			System.out.println("Essa calculadora não calcula raízes complexas.");
			sair(entrada);
			System.exit(2);
		}

		//Cálculo da fórmula de bhaskara
		double x1 = (-coefB+(Math.sqrt(delta)))/2*coefA;
		double x2 = (-coefB-(Math.sqrt(delta)))/2*coefA;

		if (delta == 0) {
			System.out.println("O X é "+x1+".");
			sair(entrada);
			System.exit(0);
		} else {
			System.out.println("O X1 é "+x1+".");
			System.out.println("O X2 é "+x2+".");
			sair(entrada);
			System.exit(0);
		}

	}
}