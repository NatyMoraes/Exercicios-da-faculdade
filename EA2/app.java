/*
 =========================================================================
 
 Fazer um programa em Java que solicita ao usuário dois números inteiros positivos.

O programa deverá garantir que o usuário informe valores válidos. Se o usuário informar valores inválidos, o programa deverá solicitá-los novamente.

O programa deverá contar os números, de 1 em 1, contando do menor número fornecido até o maior número fornecido.

Sempre que um número for divisível por 3, o programa deverá mostrar "PING".

Sempre que um número for divisível por 5, o programa deverá mostrar "PONG".

Se um número for divisível por 3 e também por 5, o programa deverá mostrar "PINGPONG".


 
 =========================================================================
 */



import java.util.Scanner;

public class app
{
    public static void main (String args[])
    {
      int maior;
      int menor;
      
        Scanner teclado = new Scanner(System.in);
     
        
                
            System.out.println("Digite Valor positivo para A");
            int A = teclado.nextInt();
            while (A < 0){
                System.out.println("Digite Valor positivo para A");
                A = teclado.nextInt();
            } 
       
            System.out.println("Digite Valor positivo para B");
            int B = teclado.nextInt();
            while (B < 0){
                System.out.println("Digite Valor positivo para B");
                B = teclado.nextInt();
            } 
            
            if (A > B){
                maior = A;
                menor = B;
            }else 
                maior = B;
                menor = A;
           
            for(int num = menor; num <= maior; num++){
                
                if(num %3 == 0 && num %5 == 0){
                    System.out.println("" + num);
                    System.out.println("PingPong");
                }else{
                    if(num %3 == 0){
                        System.out.println("" + num);
                     System.out.println("Ping");
                    }else{
                        if(num %5 == 0){
                            System.out.println("" + num);
                            System.out.println("Pong");
                        }
                    }
                }
            }
                
                
        System.out.println("FIM");
    }
}