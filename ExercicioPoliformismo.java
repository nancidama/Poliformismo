package Poliformismo;

public class ExercicioPoliformismo {
	
	private String nomeAnimal;
	private String idade;
	private String somqueFaz;
	
	public ExercicioPoliformismo(String nomeAnimal,String idade,String somqueFaz) 
	{
	
	this.nomeAnimal= nomeAnimal;
	this.idade= idade;
	this.somqueFaz= somqueFaz;
}
	
	public void imprimirInfo()
{
		System.out.println("\nQual é o nome do animal: "+nomeAnimal);
		System.out.println("\nQual a idade dele: "+idade);
		System.out.println("\nQual som ele emite :"+somqueFaz);}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSomqueFaz() {
		return somqueFaz;
	}

	public void setSomqueFaz(String somqueFaz) {
		this.somqueFaz = somqueFaz;
	}
}
	
