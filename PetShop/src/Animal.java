
public abstract class Animal implements Metodos {
	private String id;
	private double peso;
	private double idade;
	private String cor;
	private Double preco;
	private Double comprimento;
		
	
	public Animal(String id,double peso, double idade, String cor,double preco,double comprimento) {
		super();
		this.id=id;
		this.peso = peso;
		this.idade = idade;
		this.cor = cor;
		this.preco=preco;
		this.comprimento=comprimento;
		
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getIdade() {
		return idade;
	}
	public void setIdade(double idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getComprimento() {
		return comprimento;
	}
	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}
	
	
	
}
	
	
	
	

