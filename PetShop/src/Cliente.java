
public class Cliente extends Pessoa  {
	private int qntCompras;
	public Cliente(String nome, int idade, String cpf,int qntCompras) {
		super(nome, idade, cpf);
		this.qntCompras=qntCompras;
	}
	
	
	public int getQntCompras() {
		return qntCompras;
	}


	public void setQntCompras(int qntCompras) {
		this.qntCompras = qntCompras;
	}


	public double calcCredito() {
		double credito=this.getQntCompras()*8.5;
		return credito;
	}
	

}
