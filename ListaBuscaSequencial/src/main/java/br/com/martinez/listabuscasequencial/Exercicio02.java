
package br.com.martinez.listabuscasequencial;

import java.util.Scanner;
import java.util.Random;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        int num = -1; 
        int[] x = new int[2000];
        int[] y = new int[2000];
        
        for (int i=0; i<x.length; i++) {
            x[i] = random.nextInt(2000);
            y[i] = x[i];
        } 
   
        quickSort(y, 0, y.length-1);
        
        while(num != 0) {
            System.out.println("Insira o número a ser pesquisado (0 = Sair): \n");
            num = sc.nextInt();
            System.out.println("Resultado não ordenado: " + busca_sequencial_nord(x, num) + "\n");
            System.out.println("Resultado ordenado: " + busca_sequencial_ord(y, num) + "\n");
        }        
        
    }
    
    //NAO ORDENADO
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
    
    //ORDENADO
    private static String busca_sequencial_ord(int x[], int num) {
        
        String retorno = "Número não encontrado!";
        for(int i=0; i<x.length && num >= x[i]; i++) {
            if(x[i] == num) {
                retorno = "Número encontrado! - Posição: " + i;
                break;
            }
        }
        return retorno;
        
    }
    
    private static void quickSort(int[] x, int inicio, int fim) {
        
        int posicao_pivo;
        
        if(inicio < fim) {
            posicao_pivo = particao(x, inicio, fim);
            quickSort(x,inicio, posicao_pivo - 1);
            quickSort(x, posicao_pivo + 1, fim);
        }
        
    }
    
    private static int particao(int[] x, int inicio, int fim) {
        
        int pivo, i, j;
        
        pivo = x[inicio];
        i = inicio + 1;
        j = fim;
        
        while(i <= j) {
            if(x[i] <= pivo) {
                i++;
            }else if(pivo < x[j]) {
                j--;
            }else {
                troca(x, i, j);
                i++;
                j--;
            }
        }
        
        x[inicio] = x[j];
        x[j] = pivo;
        
        return j;
        
    }
    
    public static void troca(int[] x, int i, int j) {
        
        int aux;       
        aux = x[i];
        x[i] = x[j];
        x[j] = aux;
        
    }
    
}