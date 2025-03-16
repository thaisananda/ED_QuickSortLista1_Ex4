package view;

import javax.swing.JOptionPane;

import Controller.quickS;

public class Principal {

	public static void main(String[] args) {
		
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
		
		int vetor[] = new int [tamanho];
		
		for(int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " + i + ":"));
        }
        
		
		quickS sort = new quickS();
		int inicio = 0;
		int fim = vetor.length - 1;
		vetor = sort.quickSort(vetor, inicio, fim);
		for(int i : vetor) {
			System.out.print(i + " ");
		}
	}
}
