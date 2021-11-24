package ExercicioAbstratoFormas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Forma> figuras = new ArrayList<>();
		System.out.print("Entre com o numero de figuras: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Entre com a figura #" + i + ": ");
			System.out.print("Retangulo ou circulo (r/c): ");
			char c = sc.next().charAt(0);
			System.out.print("Cor da figura: (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(c == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				figuras.add(new Retangulo(color,altura,largura));
			}
			else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				figuras.add(new Circulo(color,raio));
			}
		}
		System.out.println();
		System.out.println("AREA DAS FIGURAS: ");
		
		for(Forma forma : figuras) {
			System.out.println(String.format("%.2f", forma.Area()));
		}
		
		sc.close();
	}
}
