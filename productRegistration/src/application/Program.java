// Simples programa para o cadatro de produtos.

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		// Instruction messages.
		System.out.println("Cadastro de produtos");
		System.out.println();
		
		// Data capture and registration.
		Integer numberOfProducts = Utils.readInt(sc, "Informe quantos produtos deseja cadastrar: ");
		System.out.println();
		
		for(int i=0; i<numberOfProducts; i++) {
			String productName = Utils.readString(sc, "Informe o nome do produto: ");
			Integer productQuantity = Utils.readInt(sc, "Informe a quantidade a ser cadastrada: ");
			Double productPrice = Utils.readDouble(sc, "Informe o valor do produto: ");
			
			products.add(new Product(productName, productPrice, productQuantity));
			System.out.println();
		}
		
		// List output.		
		System.out.printf("Produtos cadastrados:%n");
		for(int i=0; i<products.size(); i++) {
			System.out.printf("ID: %d - Produto: %s%n", i+1, products.get(i).getName());
		}
		
		// List modification.
		System.out.println();
		String removeItem = Utils.readRemoveItem(sc, "Deseja remover algum item do estoque s/n ?: ");
		System.out.println();
		
		if(removeItem.matches("[sS]")) {
			Integer listSize = products.size();
			Integer removeId = Utils.readId(sc, "Informe a ID do item que deseja remover: ", listSize);
			products.remove(removeId -1);
		}
		
		// Final list output.
		System.out.println("Lista atualizada:");
		for(Product item : products) {
			System.out.println(item);
		}
		
		
		sc.close();
	}

}
