/*
 ===========================================================================
 
 Informações Gerais
 O DNA é um ácido nucleico composto por uma
sequência de nucleotídeos, denominados citosina,
adenina, guanina, timina ou (CAGT).
 Vamos definir como grupo de nucleotídeos uma
sequência de exatamente 3 nucleotídeos, ex. AGG
 Uma sequência de DNA, como
AGTCAGTACGTCAGTACAACAACGTCAAGA,
portanto, pode ser vista como um conjunto de
grupos: [3 nucleotídeos] [3 nucleotídeos] [3
nucleotídeos]...
Então a sequência de DNA anterior contém 9 grupos,
cada um no seu SLOT:
[AGT][CAG][TAC][GTC][AGT][ACA][ACA][ACG][TCA]
 1 2 3 4 5 6 7 8 9
 --------------------------------------------------------
                    Tarefa
Fazer um programa em Java que solicita ao usuário:
a) Uma sequência de DNA de qualquer
tamanho
b) Um grupo (3 nucleotídeos)
O programa deverá verificar que a entrada contém
apenas os caracteres CATG. Se contiver qualquer
outro caractere, o programa deverá ser encerrado
com a mensagem “Dados de entrada inválidos”.
Em seguida, o programa deverá identificar se o grupo
fornecido pelo usuário está presente na sequência de
DNA fornecida. Se estiver, dizer o número do slot em
que ele foi encontrado (iniciando em 1). Se não
estiver, a resposta deverá ser -1 e uma mensagem
adequada deverá ser exibida. Se o grupo existir mais
de uma vez, identificar apenas a primeira ocorrência.
 
 ===========================================================================
 */

import java.util.Scanner;
import java.util.List;
 
public class string {
      public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        System.out.printf("\nInforme o DNA Completo:\n");
        String palavra = teclado.nextLine();
        
        System.out.printf("\nInforme o Grupo:\n");
        String grupo = teclado.nextLine();
        
        for (int i=0; i< palavra.length(); i++) {
              if ((palavra.charAt(i) != 'C') && (palavra.charAt(i) != 'c') &&
                  (palavra.charAt(i) != 'A') && (palavra.charAt(i) != 'a') &&
                  (palavra.charAt(i) != 'T') && (palavra.charAt(i) != 't') &&
                  (palavra.charAt(i) != 'G') && (palavra.charAt(i) != 'g')){
                      System.out.printf("\nInforme o DNA completo:\n");
                      palavra = teclado.nextLine();
              }
        }
        
        for (int i=0; i< grupo.length(); i++) {
              if ((grupo.charAt(i) != 'C') && (grupo.charAt(i) != 'c') &&
                  (grupo.charAt(i) != 'A') && (grupo.charAt(i) != 'a') &&
                  (grupo.charAt(i) != 'T') && (grupo.charAt(i) != 't') &&
                  (grupo.charAt(i) != 'G') && (grupo.charAt(i) != 'g')){
                      System.out.printf("\nInforme o Grupo:\n");
                      grupo = teclado.nextLine();
              }
        }
        char[] letras = palavra.toCharArray();

        int slot = 1;  

       for(int i = 3; i <= palavra.length(); i+=3) {
           if(palavra.substring(i-3, i).equalsIgnoreCase(grupo)) {
               System.out.printf("O Grupo %s foi encontrado no Slot %d ",grupo ,slot );
               return;
           } else {
               slot++;
           }
       }   
    }
}
