import java.util.*;
public class Exercicio1_5 {

	public static void main(String[] args) {
		// 1 - variaveis
		float pes;
		float polegadas;
		float centimetros;
		float jardas;
		float milhas;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite a medida em pes: ");
		pes = leia.nextFloat();
		
		// 3 - calculos
		polegadas = pes * 12;
		centimetros = polegadas * (float)2.54;
		jardas = pes / 3;
		milhas = jardas / 1760;
		
		// 4 - saida de dados
		System.out.println("valor em polegadas: " + polegadas);
		System.out.println("valor em centimetros: " + centimetros);
		System.out.println("valor em jardas: " + jardas);
		System.out.println("valor em milhas: " + milhas);
		

	}

}