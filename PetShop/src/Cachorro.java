
public class Cachorro extends Animal {
	private boolean pedigree;
	

	public Cachorro(String id,double peso, double idade, String cor,double preco, double comprimento,boolean pedigree) {
		super(id,peso,idade,cor,preco,comprimento);
		this.pedigree=pedigree;
	} 

	
	public boolean isPedigree() {
		return pedigree;
	}

	public void setPedigree(boolean pedigree) {
		this.pedigree = pedigree;
	}


	public double CalcValorVenda() {
		double valorVenda;
		if(this.isPedigree()) {
			 valorVenda=this.getPreco()+((10*this.getPreco())/(100));
		}
		else {
			valorVenda=this.getPreco();
		}
		return valorVenda;
	}
	public double CalcIMC() {
		double IMC=(this.getPeso()) / (this.getComprimento()*this.getComprimento());
		return IMC;
		
	}
	
	public void Descrever() {
		System.out.print("Cachorro de ID: "+this.getId()+" \n Peso: "+this.getPeso()+" KG"+" \n Idade: "+this.getIdade()+" \n Cor: "+this.getCor()+"\n Preco: "+this.getPreco()+"\n Comprimento: "+this.getComprimento()+" CM"+"\n Pedigree? "+this.isPedigree());
	}
	
}
