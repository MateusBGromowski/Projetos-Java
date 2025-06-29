import java.util.Scanner;
public class GerenciadorDeTarefa {
	public static void pausar(Scanner entrada) {
    	System.out.print("\nPressione Enter para continuar...");
   	 	entrada.nextLine();
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int escolha = 5;
		boolean tarefaCompleta = false;
		String nomeDaTarefa = "Tarefa ainda não criada.";
		String apagar = "N";
		String concluirTarefa = "N";
		while (true) {
			System.out.println("\n=======MENU=======");
			System.out.println("1 - Criar tarefa");
			System.out.println("2 - Ver tarefa");
			System.out.println("3 - Editar tarefa");
			System.out.println("4 - Apagar tarefa");
			System.out.println("0 - Sair");
			System.out.println("==================");
			System.out.print("Escolha: ");
			escolha = entrada.nextInt();
			entrada.nextLine();
			switch (escolha) {
				case 1:
					System.out.print("Qual é o nome da tarefa?: ");
					nomeDaTarefa = entrada.nextLine();
					pausar(entrada);
				break;
				case 2:
					if (tarefaCompleta == true) {
						System.out.println(nomeDaTarefa + " - Tarefa Concluída.");
					} else {
						System.out.println(nomeDaTarefa + " - Tarefa Não Feita.");
					}
					pausar(entrada);
				break;
				case 3:
					System.out.print("Deseja marcar a tarefa como concluída? (S/N): ");
					concluirTarefa = entrada.nextLine();
					if (concluirTarefa.equalsIgnoreCase("S")) {
						tarefaCompleta = true;
					} else if (concluirTarefa.equalsIgnoreCase("N")) {
						tarefaCompleta = false;
					} else {
						System.out.println("Entrada inválida");
					}
					pausar(entrada);
				break;
				case 4:
					System.out.print("Deseja realmente apagar a tarefa? S/N: ");
					apagar = entrada.nextLine();
					if (concluirTarefa.equalsIgnoreCase("S")) {
						nomeDaTarefa = "Tarefa ainda não criada.";
						tarefaCompleta = false;
					} else if (apagar == "N" || apagar == "n") {
						System.out.println("Você optou por não apagar.");
					} else {
						System.out.println("Entrada inválida.");
					}
					pausar(entrada);
				break;
			case 0:
				System.out.println("Obrigado por usar o Gerenciador De Tarefa");
				System.exit(0);
			break;
			}
		}
	}
}