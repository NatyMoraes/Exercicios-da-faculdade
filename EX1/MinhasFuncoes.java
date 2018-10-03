/*
     * Generico
     public static tipo metodo (parametros)
    {
        tipo variavel;
       
        funcoes/calculos/etc...
       
        return variavel;
    }
     */



public class MinhasFuncoes
{  
    public static double calculaMedia (int a ,int b, int c)
    {
        double med;
       
        med = (a+b+c) / 3;
        
        return med;        
    }

    public static int verificaMaior (int a ,int b, int c)
    {
        int maior;
        if (a>b && a>c){
            return maior = a;
        }else{
            if(b>a && b>c){
                return maior = b;
            } else {
                return maior = c;
            }   
        }   
    }

    public static int verificaMenor (int a, int b, int c)
    {
        int menor = 0;
        if ((a < b) && (a < c)){
            return menor = a;
        }else {
            if ((b < a) && (b < c)){
                return menor = b;
            }else{  
                return menor = c;
            }
        }
    }
        
    public static double calculaArea(double larguraCasa, double comprimentoCasa, double larguraTerreno ,double comprimentoTerreno)
    {
        double areaLivre;
        double areaCasa;
        double areaTerreno;
        areaCasa = larguraCasa + comprimentoCasa;
        areaTerreno = larguraTerreno + comprimentoTerreno;
        areaLivre = areaTerreno - areaCasa;
        return areaLivre;
    }
    
    public static int verificaPar (int a, int b, int c)
    {
      int par = 0;
      if ( a%2 == 0){
          par = par+1;
      }
      if ( b%2 == 0){
          par = par+1;
      }
      if ( c%2 == 0){
          par = par+1;
      }
      return par;
    }
    
    
}
