import java.util.Scanner;
public class area
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        double larguraCasa ;
        double comprimentoCasa;
        double larguraTerreno;
        double comprimentoTerreno;
        
        System.out.print("Informe o Largura da Casa: ");
         larguraCasa = in.nextDouble();
        
        System.out.print("Informe o comprimento da Casa: ");
         comprimentoCasa = in.nextDouble();
        
        System.out.print("Informe o Largura do Terreno: ");
         larguraTerreno = in.nextDouble();
        
        System.out.print("Informe o comprimento do Terreno: ");
         comprimentoTerreno = in.nextDouble();
        
        
        double area = MinhasFuncoes.calculaArea(larguraCasa, comprimentoCasa, larguraTerreno ,comprimentoTerreno);
        System.out.printf("A area Livre e %.0f m² ", area);
        
        
        
    }
}