import java.util.Scanner;

public class CalculadoraIMC {
	public static double calculaImc(float altura, float peso) {
		return(peso / (Math.pow(altura, 2.0f)));
	}

	public static void classificacao(double imc) {
		
		System.out.printf("Seu IMC é: %.2f%n", imc);

		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso.");
		} else if (imc <= 24.9) {
			System.out.println("Parabéns, você está no peso ideal.");
		} else if (imc <= 29.9){
			System.out.println("Você está acima do peso.");
		} else {
			System.out.println("Você está obeso.");
		}

	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Qual é a sua altura? (em metros, exemplo 1,75): ");
		float altura = entrada.nextFloat();

		System.out.print("Qual é o seu peso?: ");
		float peso = entrada.nextFloat();

		double imc = calculaImc(altura, peso);
		classificacao(imc);
	}


}