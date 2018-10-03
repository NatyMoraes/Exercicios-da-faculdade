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

public class PingPong
{
    public static void main (String args[])
    {
     int a = 0;
     int b = 0;
     int c = 0;
      
        Scanner teclado = new Scanner(System.in);
     
    
       
        while (a < 0){
            System.out.println("Digite Valor positivo para a");
            a = teclado.nextInt();
        } 
    
        
        while (b < 0){
            System.out.println("Digite Valor positivo para b");
            b = teclado.nextInt();
        } 
        
        
        while (c < 0){
            System.out.println("Digite Valor positivo para c");
            c = teclado.nextInt();
        } 
        
        
            
        int maior = MinhasFuncoes.verificaMaior(a, b, c);
        int menor = MinhasFuncoes.verificaMenor(a, b, c);
        
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