/*
 /* 
=============================================================================
 Este programa solicita três números inteiros.
Digite o primeiro número:
23
Digite o segundo número:
9
Digite o terceiro número:
16

A diferença entre o maior número e o menor número é 14.
Quantidade de números pares informados: 1.
FIM DO PROGRAMA

=============================================================================
*/


import java.util.Scanner;



public class diferencaPar
{
    public static void main (String args[])
    {
      int a;
      int b;
      int c;
      
        
        Scanner in = new Scanner(System.in);
        
        System.out.print(" Digite um Numero Inteiro ");
        a = in.nextInt();
        
        System.out.print(" Digite um Numero Inteiro ");
        b = in.nextInt();
        
        System.out.print(" Digite um Numero Inteiro ");
        c = in.nextInt();
        

        //system.out.println("A Diferenca entre o maior e o menor é: " + diferenca);
      
        int maior = MinhasFuncoes.verificaMaior(a ,b ,c);
        System.out.println("O Maior numero e:" + maior );
        
        int menor = MinhasFuncoes.verificaMenor(a ,b ,c);
        System.out.println("O Menor numero e:" + menor );
        
        System.out.println("A Diferença entre eles e:" + (maior - menor) );
        
        int par = MinhasFuncoes.verificaPar(a ,b ,c);
        System.out.printf("A quantidade de numeros pares e : %.0d ", par);
                
        
    }
}