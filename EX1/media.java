import java.util.Scanner;
public class media
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
        
        
        double media = MinhasFuncoes.calculaMedia(a ,b ,c);
        System.out.println("A media dos seus numeros e:" + media);
        
        
        
    }
}