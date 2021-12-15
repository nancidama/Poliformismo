package Poliformismo;

public class AnimalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CachorroEx Cachorro = new CachorroEx ("\nTed", "7 anos","au au",true);
		
		CavaloEx Cavalo = new CavaloEx ("\nAlazão", "20 anos","irriii",true);
		
		PreguicaEx Preguica = new PreguicaEx ("\nPretty", "9 anos","shiii",true);
		
		Cachorro.imprimirInfo();
		Cachorro.imprimirmovimento();
		
		Cavalo.imprimirInfo();
		Cavalo.imprimirmovimento();
		
		Preguica.imprimirInfo();
		Preguica.imprimirmovimento();
		
		
		
	}

}
