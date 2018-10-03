import java.util.Scanner;
public class MaiorDeTres
{
    public static void main (String args[])
    {
        
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int c;
        
        System.out.print("Digite primeiro valor: ");
        a = in.nextInt();
        
        System.out.print("Digite segundo valor: ");
        b = in.nextInt();
        
        System.out.print("Digite terceiro valor: ");
        c = in.nextInt();
        
        int maior = MinhasFuncoes.verificaMaior(a ,b ,c);
        System.out.println("O maior numero e:" + maior);
        

        
    }
}