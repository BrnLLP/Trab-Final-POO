
import java.io.File;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		ArrayList<Animal> animais = new ArrayList<Animal>();
		String arquivo1 = "entrada1.txt";
		File f1 = new File(arquivo1);
		
		
		try { 
			
			try(Scanner s1 = new Scanner(f1)){
			for(int i=0;i<=3;i++) {
				if(i<=1) {
					String id = s1.next();
					double peso = s1.nextDouble();
					double idade = s1.nextDouble();
					String cor = s1.next();
					double preco = s1.nextDouble();
					boolean pedigree = s1.nextBoolean();
					double comprimento = s1.nextDouble();
					Cachorro c = new Cachorro(id,peso,idade,cor,preco,comprimento,pedigree);
					animais.add(c);
				}
				else {
					String id = s1.next();
					double peso = s1.nextDouble();
					double idade = s1.nextDouble();
					String cor = s1.next();
					double preco = s1.nextDouble();
					String tipoAgua = s1.next();
					double comprimento = s1.nextDouble();
					Peixe p = new Peixe(id,peso,idade,cor,preco,comprimento,tipoAgua);
					animais.add(p);
				}
			}
				
			s1.close();
			}
			
		}	catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			
		}
			catch (InputMismatchException e) {
			System.out.println("Erro de dados");
			
		}
		
	     
		for(int i=0 ; i<animais.size(); i++) {
			animais.get(i).Descrever();
			System.out.println("\n Valor de venda: "+animais.get(i).CalcValorVenda());
			if(i<=1) {
				Cachorro c= (Cachorro) animais.get(i);
				System.out.println(" IMC: "+ c.CalcIMC()+"\n");
			}
			else {
				Peixe p= (Peixe) animais.get(i);
				System.out.println(" Aquário ideal: "+ p.AquarioIdeal()+" CM \n");
			}
			
			
		}
		try {
			FileWriter result = new FileWriter("resultado1.txt");
			PrintWriter gravar = new PrintWriter(result);
			double pesoTotal=0;
			for(int i=0 ; i<animais.size(); i++) {
				pesoTotal = animais.get(i).getPeso()+pesoTotal;
			}
			gravar.printf("Peso total: "+pesoTotal);
			
		result.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		ArrayList<Pessoa>pessoas = new ArrayList<Pessoa>();
		double salarios[] = new double[10];
		int compras[] = new int[10];
		String arquivo2 = "entrada2.txt";
		File f2 = new File(arquivo2);
		
		try { 
			
			try(Scanner s2 = new Scanner(f2)){
			for(int i=0;i<=3;i++) {
				if(i<=1) {
					String cpf = s2.next();
					String nome =  s2.next();
					int idade = s2.nextInt();
					double horaTrab = s2.nextDouble();
					Funcionario f = new Funcionario(nome,idade,cpf,horaTrab);
					pessoas.add(f);
				}
				else {
					String cpf = s2.next();
					String nome =  s2.next();
					int idade = s2.nextInt();
					int qntCompras = s2.nextInt();
					Cliente c = new Cliente(nome,idade,cpf,qntCompras);
					pessoas.add(c);
				}
			}
				
			s2.close();
			}
			
		}	catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			
		}
			catch (InputMismatchException e) {
			System.out.println("Erro de dados");
			
		}
			for(int i=0;i<=3;i++) {
				if(i<=1) {
					Funcionario f= (Funcionario) pessoas.get(i);
					System.out.println("Salário do funcionário :" +f.calcSalario());
				}
				else {
					Cliente c=(Cliente) pessoas.get(i);;
					System.out.println("Crédito do cliente: "+c.calcCredito());
				}
			}
		
		try {
			FileWriter result = new FileWriter("resultado2.txt");
			PrintWriter gravar = new PrintWriter(result);
			double mediaIdade=0;
			int idadeTotal=0;
			for(int i=0 ; i<pessoas.size(); i++) {
				idadeTotal= idadeTotal+pessoas.get(i).getIdade();
			}
			mediaIdade=idadeTotal/pessoas.size();
			gravar.printf("Média de idade: "+mediaIdade);
			
		result.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
		
	 
		

	}
}
