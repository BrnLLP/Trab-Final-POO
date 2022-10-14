
public class Peixe extends Animal {
	private String tipoAgua;
	public Peixe(String id,double peso, double idade, String cor,double preco,double comprimento, String tipoAgua) {
		super(id,peso, idade, cor,preco,comprimento);
		this.tipoAgua=tipoAgua;
	}
	
	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public double CalcValorVenda() {
		double valorVenda;
		if(this.getTipoAgua().equals("Doce")) {
			valorVenda=this.getPreco()+((3*this.getPreco())/(100));
			
		}
		else {
			valorVenda=this.getPreco()+((5*this.getPreco())/(100));
		}
		return valorVenda;
	}
	
	public void Descrever() {
		System.out.print("Peixe de ID: "+this.getId()+" \n Peso: "+this.getPeso()+" KG"+" \n Idade: "+this.getIdade()+" \n Cor: "+this.getCor()+"\n Preco: "+this.getPreco()+" \n Comprimento: "+this.getComprimento()+" CM"+" \n Tipo de água: "+this.getTipoAgua());
	}
	
	public double AquarioIdeal() {
		double tamanhoIdeal=(this.getComprimento()*10) * 5;
		return tamanhoIdeal;
	}
}
