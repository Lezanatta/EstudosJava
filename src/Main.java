import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Estudante [] estudante = new Estudante [10];
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a quantidade de estudante a ser cadastrado: ");
		int quatidadeEstudante = ler.nextInt();
		
		for(int i = 0; i<quatidadeEstudante; i++) {
			System.out.println("Alguel #"+ (i+1));
			System.out.print("Nome:" );
			String nome = ler.next();
			System.out.print("Email:" );
			String email = ler.next();
			System.out.print("Quarto" );
			int quarto = ler.nextInt();
			estudante[quarto] = new Estudante(nome,email,quarto);
		}
		
		System.out.println();
		for(Estudante es : estudante) {
			if(es != null) {
			System.out.println(es);
			System.out.println();
			}
		}
	}

}
