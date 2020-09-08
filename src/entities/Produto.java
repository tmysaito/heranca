package entities;

public class Produto {
	
	private String nome;
	public Double preco;
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String Etiqueta() {
		return nome + " $ " + String.format("%.2f", preco);
	}
	
	
}
