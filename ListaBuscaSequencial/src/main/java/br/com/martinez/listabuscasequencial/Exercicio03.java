
package br.com.martinez.listabuscasequencial;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int[] y = {4,6,9,31,50,56};
        int[] x = new int[6];
        
        System.out.println("Digite os números jogados por você na Mega-Sena:");
        for(int i=0; i<x.length; i++) {
            x[i] = s.nextInt();
        }
        
        busca_sequencial_nord(x, y);
        
    }
    
    //NAO ORDENADO
    private static void busca_sequencial_nord(int x[], int y[]) {
        
        int z[] = new int[6];
        int total;
        
        for(int i=0; i<y.length; i++) {
            if(y[i] == x[i]) {
                z[i] = 1;
            } else  {
                z[i] = 0;
            }
        }
        
        total = z[0] + z[1] + z[2] + z[3] + z[4] + z[5];
        
        switch(total) {
            case 4:
                System.out.println("Você teve 4 acertos e ganhou R$ 1.118,21!");
                break;
            case 5:
                System.out.println("Você teve 5 acertos e ganhou R$ 62.081,21!");
                break;
            case 6:
                System.out.println("Você teve 6 acertos e ganhou R$ 1.000.000,00!");
                break;
            default:
                System.out.println("Você teve " + total + " acertos e não ganhou nada!");
        }
        
    }
    
}