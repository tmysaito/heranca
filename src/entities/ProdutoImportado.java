package entities;

public class ProdutoImportado extends Produto {

	private Double taxa;

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double precoTotal() {
		return getPreco() + taxa;
	}

	@Override
	public String Etiqueta() {
		return getNome() + " $ " + String.format("%.2f", precoTotal()) + " (Taxa: $" + String.format("%.2f", taxa)
				+ ")";

	}

}
