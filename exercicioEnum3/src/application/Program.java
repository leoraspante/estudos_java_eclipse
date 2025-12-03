// Atividade de revisão recomendada pelo Copilot.

package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Author;
import entities.Book;
import entities.Borrower;
import entities.Loan;
import entities.enums.LoanStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in); // Permite a captura de dados.
		
		List<Book> books = new ArrayList<>(); // Cria uam lista para cadastro de livros.
		List<Borrower> borrowers = new ArrayList<>(); // Cria uma lista para cadastros de locatários.
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Define o padrão de data a ser utilizado.
		
		// Mensagem de boas vindas.
		System.out.println("--------------------Controle Bibliotecário---------------------");
		System.out.println();
		System.out.println("-----------------------Instruções de uso-----------------------");
		System.out.println("1 - Informe a quantidade de livros que deseja cadastrar.");
		System.out.println("2 - Informe os dados solicitados do autor e livro.");
		System.out.println("3 - Informe os dados solicitados do locatário.");
		System.out.println("4 - Informe os dados solicitados da locação..");
		System.out.println();

		
		//------------------------------------CÓDIGOS CADASTRO DE LIVRO----------------------------------------------//
		
		// Mensagem do menu de cadastro.
		System.out.println("----------------------Cadastro de Livros-----------------------");
		System.out.println(); // Quebra de linha para melhor legibilidade.
		
		// Inicialização de variavel controlando a qtd de registros.
		int qtdLivros = 0;
		
		// Garante uma entrada numérica válida.
		do {
			System.out.print("Quantos livros deseja cadastar no sistema: ");
			qtdLivros = sc.nextInt();
			sc.nextLine();
			if(qtdLivros <= 0) {
				System.out.printf("Valor inválido!%nInforme um valor inteiro maior que zero.%n%n");
			}
		} while(qtdLivros <=0);
		System.out.println(); // Quebra de linha para melhor legibilidade.
		
		
		// Bloco responsável pela captura e registro dos livros.
		System.out.println("Informe os dados do livro:");
		
		// For coletando os dados do livro.
		for(int i=0; i<qtdLivros; i++) {
			
			System.out.println(); // Quebra de linha entre registros para melhor legibilidade.
			System.out.printf("Dados do %dº livro:%n", i+1);
			System.out.print("Título: ");
			String bookTitle = sc.nextLine();

			System.out.print("Autor: ");
			String authorName = sc.nextLine();
			
			System.out.print("Email do autor: ");
			String authorMail = sc.next();
			sc.nextLine();
			
			System.out.print("Preço: R$ ");
			double bookPrice = sc.nextDouble();
			sc.nextLine();
			
			Author author = new Author(authorName, authorMail); // Cria o objeto autor.
			Book book = new Book(bookTitle, bookPrice, author); // Cria o objeto livro.		
			books.add(book); // Adiciona o livro a uma lista.
		}

		System.out.println(); // Quebra de linha para melhor legibilidade.
		
		
		//------------------------------------CÓDIGOS CADASTRO DE LOCATÁRIO----------------------------------------------//
		
		// Mensagem do menu de cadastro.
		System.out.println("--------------------Cadastro de Locatário----------------------");
		System.out.println(); // Quebra de linha para melhor legibilidade.
		
		// Inicialização de variavel controlando a qtd de locatários.
		int qtdLocatarios = 0;
		
		// Garante uma entrada numérica válida.
		do {
			System.out.print("Quantos locatários deseja cadastar no sistema: ");
			qtdLocatarios = sc.nextInt();
			sc.nextLine();
			if(qtdLocatarios <= 0) {
				System.out.printf("Valor inválido!%nInforme um valor inteiro maior que zero.%n%n");
			}
		} while(qtdLocatarios <=0);
		System.out.println(); // Quebra de linha para melhor legibilidade.
		
		// Bloco responsável pela captura e registro dos livros.
		System.out.println("Informe os dados do locatário:");
		
		// For coletando e registrando os dados do locatário.
		for(int i=0; i<qtdLocatarios; i++) {
			System.out.println(); // Quebra de linha entre registros para melhor legibilidade.
			System.out.printf("Dados do %dº locatário:%n", i+1);
			System.out.print("Nome: ");
			String borrowerName = sc.nextLine();
			
			System.out.print("Email: ");
			String borrowerMail = sc.next();
			sc.nextLine();
			
			System.out.print("Data de nascimento (dd/MM/yyyy): ");
			LocalDate birthDate = LocalDate.parse(sc.next(), fmt);
			sc.nextLine();

			Borrower borrower = new Borrower(borrowerName, borrowerMail, birthDate); // Cria novo objeto locatário
			borrowers.add(borrower); // Adiciona o locatário a lista
		}
		
		System.out.println(); // Quebra de linha para melhor legibilidade.
		
		
		//----------------------------CÓDIGOS REFERENTE A EXIBIÇÃO DE LIVROS E LOCATÁRIOS DISPONÍVEIS-----------------------------------------//
		
		// Exibição dos livros disponíveis para locação.
		System.out.println("----------------------------------------------------------------"); // Separador.
		System.out.println(); // Quebra de linha para melhor legibilidade.
		System.out.println("Livros disponíveis para locação:");
		System.out.println();
		for(int i=0; i<books.size(); i++) {
			System.out.printf("ID: %d - %s%n%n",i+1, books.get(i));
		}
		
		// Exibição dos locatários cadastrados no sistema.
		System.out.println("----------------------------------------------------------------"); // Separador.
		System.out.println(); // Quebra de linha para melhor legibilidade.
		System.out.println("Locatários cadastrados no sistema:");
		System.out.println();
		for(int i=0; i<borrowers.size(); i++) {
			System.out.printf("ID: %d - %s%n%n",i+1, borrowers.get(i));
		}
		
		//----------------------------CÓDIGOS REFERENTE AO REGISTRO DA LOCAÇÃO-----------------------------------------//
		
		// Mensagem do menu de cadastro.
		System.out.println();
		System.out.println("--------------------Registro de Locação----------------------");
		System.out.println(); // Quebra de linha para melhor legibilidade.
				
		LocalDateTime loanMoment = LocalDateTime.now(); // Momento da locação, registrado automaticamente.
		
		// Bloco responsável pela escolha correta do livro.
		int bookId = -1; // Inicialização de variável para escolha do livro, com valor inválido.
		
		// Do/While garantindo uma escolha correta de livro.
		do {
			System.out.print("Digite o ID do livro que deseja locar: ");
			bookId = sc.nextInt() -1; // subtrai 1 porque a lista começa em 0
			sc.nextLine();
			if(bookId < 0 || bookId >= books.size()) {
				System.out.printf("Livro não encontrado!%nTente novamente.%n");
			}
		} while (bookId < 0 || bookId >= books.size());
		
		System.out.println(); // Quebra de linha para melhor legibilidade.
		
		Book chosenBook = books.get(bookId);  // Obtenção do livro escolhido.
		
		// Exibição do livro escolhido.
		System.out.println("Dados do livro escolhido:");
		System.out.println(); // Quebra de linha para melhor legibilidade.
		System.out.println(chosenBook);
		System.out.println(); // Quebra de linha para melhor legibilidade.
		System.out.println("----------------------------------------------------------------"); // Separador.
		System.out.println(); // Quebra de linha para melhor legibilidade.
		
		// Bloco responsável pela escolha correta do locatário.
		int borrowerId = -1; // Inicialização de variável para escolha do locatário, com valor inválido.
		
		// Do/While garantindo uma escolha correta do locatário.
		do {
			System.out.print("Digite o ID do locatário: ");
			borrowerId = sc.nextInt() -1; // subtrai 1 porque a lista começa em 0
			sc.nextLine();
			if(borrowerId < 0 || borrowerId >= borrowers.size()) {
				System.out.printf("Locatário não encontrado!%nTente novamente.%n");
			}
		} while (borrowerId < 0 || borrowerId >= borrowers.size());
		
		System.out.println(); // Quebra de linha para melhor legibilidade.
		
		Borrower chosenBorrower = borrowers.get(borrowerId);  // Obtenção do locatário escolhido.
		
		// Exibição do locatário escolhido.
		System.out.println("Dados do locatário escolhido:");
		System.out.println(); // Quebra de linha para melhor legibilidade.
		System.out.println(chosenBorrower);
		System.out.println(); // Quebra de linha para melhor legibilidade.
		System.out.println("----------------------------------------------------------------"); // Separador.
		System.out.println(); // Quebra de linha para melhor legibilidade.		

		
		System.out.print("Informe a data de devolução (dd/MM/yyyy): ");
		String dueDateStr = sc.next();
		LocalDate dueDate = LocalDate.parse(dueDateStr, fmt);

		// cria o Loan com status ACTIVE
		Loan loan = new Loan(loanMoment, dueDate, LoanStatus.ALUGADO, chosenBorrower, chosenBook);

		System.out.println();
		System.out.printf("Locação realizada com sucesso!%nDados da locação:%n%n");
		System.out.println(loan);
		
		sc.close();
	}

}
