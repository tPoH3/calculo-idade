package sp.senai.br.idade;

import java.util.Scanner;

public class calculoIdade {
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        int i     = 0;
        int[] idade  = new int[8];
        int maior = 0;
        int menor = 1000;
        int diferenca;
        while(i < 9){
           System.out.printf("digite a %d° idade: \n",i + 1);
           idade[i] = teclado.nextInt();
           
           if(idade[i] <= 0)
           {
               System.out.printf("Esta e uma idade invalida!!!\n");
               main(null);
           }
           if(idade[i] < menor)
           {
               menor = idade[i];
               System.out.printf("A menor idade é esta:%d\n",menor);
               
           }
           if(idade[i] > maior)
           {
               maior = idade[i];
               System.out.printf("A maior idade é esta:%d\n",maior);
               
           }
           diferenca = maior - menor;
           
            System.out.printf("A maior diferença de idade e:%d\n",diferenca);
           
        i++;
        }
    }
    
}
