package Pck_Matriz;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de linhas da matriz: ");
		int linhas = sc.nextInt();
		System.out.print("Digite o numero de colunas da matriz: ");
		int colunas = sc.nextInt();
		
		int matriz [][] = new int [linhas][colunas];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length;j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite o numero a ser pesquisado na matriz: ");
		int numero = sc.nextInt();
		
		ConsultarNumeros(matriz,numero);
		sc.close();

	}
	
	public static void ConsultarNumeros(int [][] mat, int n) {
		for(int i =0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j] == n) {
					System.out.println("Posição do numero escolhido: " + i + ","+j);
					try {
						System.out.println("Numero acima dele: "+ mat[i-1][j]);
					}
					catch(Exception e){
						System.out.println("Não tem numero acima!");
					}try {
					System.out.println("Numero abaixo dele: "+ mat[i+1][j]);
					}
					catch(Exception e){
						System.out.println("Não tem numero abaixo!");
					}
					
					try {
						System.out.println("Numero a direta: "+ mat[i][j+1]);
						}
					catch(Exception e){
							System.out.println("Não tem numero a direita!");
					}
					try {
						System.out.println("Numero a esquerda: "+ mat[i][j-1]);
						}
					catch(Exception e){
							System.out.println("Não tem numero a esquerda!");
					}
					System.out.println("-------");
				}
			}
		}
	}

}
