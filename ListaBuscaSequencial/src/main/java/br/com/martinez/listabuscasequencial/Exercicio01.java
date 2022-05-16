
package br.com.martinez.listabuscasequencial;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio01 {

    public static void main(String[] args) {
        
        int x[] = {1,9,5,7,15,17,3,11,19,13};
        int num = -1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vetor não ordenado: " + Arrays.toString(x) + "\n");
        while(num != 0) {
            System.out.println("Informe o número a ser pesquisado entre 0 e 20 (0 = Sair): ");
            num = sc.nextInt();
            
            System.out.println("Resultado: " + busca_sequencial_nord(x, num) + "\n");
        }
        
    }
    
    private static String busca_sequencial_nord(int x[], int num) {
        
        String retorno = "Número não encontrado!";
        for(int i=0; i<x.length; i++) {
            if(x[i] == num) {
                retorno = "Numero encontrado! - Posição: " + i;
                break;
            }
        }
        return retorno;
        
    }
    
}