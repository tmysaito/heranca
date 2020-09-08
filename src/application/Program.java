package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> lista = new ArrayList<>();

		System.out.print("Digite numero de produtos: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Dados do Produto #" + i + ":");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			if (c == 'i') {
				System.out.print("Taxa: ");
				double taxa = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxa));
			} else if (c == 'u') {
				System.out.print("Data de Fabricacao (DD/MM/YYYY): ");
				Date data = sdf.parse(sc.next());
				lista.add(new ProdutoUsado(nome, preco, data));
			} else {
				lista.add(new Produto(nome, preco));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS:");
		for(Produto p : lista) {
			System.out.println(p.Etiqueta());
		}
		
		sc.close();
	}

}
