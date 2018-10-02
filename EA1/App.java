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



public class App
{
    public static void main (String args[])
    {
      int a;
      int b;
      int c;
      int maior = 0;
      int menor = 0;
      int diferenca = 0;
      int par = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print(" Digite um Numero Inteiro ");
        a = in.nextInt();
        
        System.out.print(" Digite um Numero Inteiro ");
        b = in.nextInt();
        
        System.out.print(" Digite um Numero Inteiro ");
        c = in.nextInt();
      /* Calcula Maior*/  
          if ((a > b) && (a > c)){
                maior = a;
            }
            
          else {
                if ((b > a) && (b > c))
                {
                    maior = b;
                }
          
                  else{  
                       if ((c > a) && (c > b))
                      {
                          maior = c;
                      }
                  }
                }
                  /*Calcula menor*/
            if ((a < b) && (a < c)){
               menor = a;
            }
              else {
                    if ((b < a) && (b < c))
                    {
                        menor = b;
                    }
              
                      else{  
                           if ((c < a) && (c < b))
                          {
                              menor = c;
                          }
                      }
                    }
    
      
        /*Calcula par*/
      
      if ( a%2 == 0){
            par = par+1;
      }
       
      if ( b%2 == 0){
          par = par+1;
      }

      if ( c%2 == 0){
              par = par+1;
      }
      
      diferenca = maior - menor;
      
      System.out.println("A Diferenca entre o maior e o menor é: " + diferenca);
      System.out.println("A Quantidade de numeros pares é: " + par);
    }
}