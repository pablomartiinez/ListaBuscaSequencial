
package br.com.martinez.listabuscasequencial;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = -1;
        int[] ra = {11,22,33,44,55,66,77,88,99,1010};
        String[] nome = {"Guilherme Kliemann","Pablo Martinez","Eduardo Magalhães","Artur Rossi","Emily Marcondes",
                         "Alan Rauber", "Luis Follmann", "Marcos Klein", "Anna Luiza", "João Eduardo"};
        while(num != 0) {
            System.out.println("Informe o RA do aluno para encontrar o nome completo: (0 = Sair):\n");
            num = sc.nextInt();
            System.out.println(busca_sequencial_nord(ra, nome, num) + "\n");
        }

    }
    
    private static String busca_sequencial_nord(int ra[], String nome[], int num) {
        
        String retorno = "\nAluno não encontrado nessa turma de ADS!";
        
        for(int i=0; i<ra.length; i++) {
            if(ra[i] == num) {
                retorno = "\nRA: " + ra[i] + "\nNome Completo: " + nome[i];
                break;
            }
        }
        return retorno;
        
    }
    
}