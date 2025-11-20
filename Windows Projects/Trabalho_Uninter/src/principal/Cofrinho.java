// Classe principal do programa.

package principal;

// Importação das classes necessárias.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
import entidades.Dolar;
import entidades.Euro;
import entidades.Real;
import entidades.Moeda;

public class Cofrinho {

	// Lista armazenando as moedas.
	private ArrayList<Moeda> listaMoedas = new ArrayList<>();
	
	// Método que permite a adição de moedas à lista.
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	
	// Método que permite a remoção de moedas da lista.
	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}
	
	// Método para visualizar todas as moedas presentes no cofrinho.
	public void listaMoedas() {
		// Implementação de um If/Else checando se a lista contém itens.
		if (listaMoedas.isEmpty()) {
			System.out.println("Sem moedas no cofrinho.");
		}
		// Implementado loop for percorrendo a lista.
		else {
			for (Moeda moeda : listaMoedas) {
				moeda.info(); // Método trazendo as informações de cada moeda.
			}
			
		}
	}
	
	// Método que permite a conversão do valor total para reais.
	public double calcularTotalConvertido() {
		double total = 0; // Variável inicializada com valor 0.
		for (Moeda moeda : listaMoedas) {
			total += moeda.converter();
		}
		return total;
	}
	
	// Início do método principal.
	public static void main(String[] args) {

		// Implementação do Scanner para a captura dos dados.
		Scanner input = new Scanner(System.in);
		
		// Definição do locale como US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Criação da instância cofrinho.
		Cofrinho cofrinho = new Cofrinho();
		
		// Inicialização de uma variável para controle do menu.
		int opcao = -1;
		
		// Definição de um loop while para permitir a execução do menu principal.
		while (opcao != 0) {
            System.out.println("\n=== MENU COFRINHO ===");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total depositado em Reais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt(); // lê a opção escolhida
            
            // Implementação de um switch case em alternativa ao if/else. Facilitando a legibilidade.
            switch (opcao) {
            	case 1:
            		// Caso 1: Definição do tipo e criação da moeda.
                    System.out.println("Informe o tipo de moeda:");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dólar");
                    System.out.println("3 - Euro");
                    // Definição de uma variável para receber o "tipo" da moeda.
                    int tipo = input.nextInt();
                    System.out.print("Informe o valor a ser depositado: ");
                    // Definição de variável para receber o valor da moeda
                    double valor = input.nextDouble();
                    
                    // Novo switch case para de fato "criar" a moeda.
                    switch (tipo) {
                    case 1:
                        cofrinho.adicionar(new Real(valor));
                        break;
                    case 2:
                        cofrinho.adicionar(new Dolar(valor));
                        break;
                    case 3:
                        cofrinho.adicionar(new Euro(valor));
                        break;
                    default:
                        System.out.println("Tipo inválido.");
                    }
                    break;
                 
                    case 2:
                    	// Bloco de código responsável pela remoção da moeda.
                        System.out.println("Informe o tipo de moeda a remover:");
                        System.out.println("1 - Real");
                        System.out.println("2 - Dólar");
                        System.out.println("3 - Euro");
                        // Definição de uma variável para receber o "tipo" da moeda a ser removida.
                        int tipoRemover = input.nextInt();
                        System.out.print("Informe o valor a ser removido: ");
                        // Definição de variável para receber o valor a ser retirado do cofrinho.
                        double valorRemover = input.nextDouble();
                        
                        // A moeda é primeiramente criada, para então verificar se a mesma existe na lista e então ser removida.
                        Moeda moedaRemover = null;
                        switch (tipoRemover) {
                        case 1:
                        	moedaRemover = new Real(valorRemover);
                            break;
                        case 2:
                            moedaRemover = new Dolar(valorRemover);
                            break;
                        case 3:
                            moedaRemover = new Euro(valorRemover);
                            break;
                        default:
                            System.out.println("Tipo inválido.");
                        }
                        
                        // Implementado If para avaliar o tipo da moeda e remover caso ela seja encontrada.
                        if (moedaRemover != null) {
                            cofrinho.remover(moedaRemover);
                            System.out.println("Moeda removida.");
                        }
                        break;
                        
                    case 3:
                    	// Exibe as moedas no cofrinho.
                    	cofrinho.listaMoedas();
                    	break;
                    
                    case 4:
                    	// Exibe o total de moedas em reais.
                    	double total = cofrinho.calcularTotalConvertido();
                    	System.out.printf("Valor total reais: R$ %.2f\n", total);
                    	break;
                    	
                    case 0:
                    	// Finaliza o programa.
                        System.out.println("Fim do programa.");
                        break;
                     
                    default:
                    	// Mensagem em caso de opção inválida.
                    	System.out.println("Opção inválida.");
            }
		}
		
		// Fechamento do comando Scanner.
		input.close();

	}

}
